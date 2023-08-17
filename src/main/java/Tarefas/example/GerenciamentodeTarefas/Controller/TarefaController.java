package Tarefas.example.GerenciamentodeTarefas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Tarefas.example.GerenciamentodeTarefas.Repository.TarefaRepository;
import Tarefas.example.GerenciamentodeTarefas.entities.Tarefa;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @PutMapping("/{id}")
    public Tarefa marcarTarefaConcluida(@PathVariable Long id) {
        Tarefa tarefa = tarefaRepository.findById(id).orElse(null);
        if (tarefa != null) {
            tarefa.setConcluida(true);
            return tarefaRepository.save(tarefa);
        }
        return null;
    }
}

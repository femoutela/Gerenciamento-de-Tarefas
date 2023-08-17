# Gerenciamento-de-Tarefas


## Visão Geral
O Sistema de Gerenciamento de Tarefas é uma aplicação simples para criar, listar e marcar tarefas como concluídas. A aplicação é construída usando Spring Boot e usa um banco de dados H2 em memória para armazenar as tarefas.

## Requisitos
Para executar e interagir com o projeto, você precisará ter o Java e o Spring Boot instalados no seu ambiente de desenvolvimento. O projeto é autocontido e usa o banco de dados H2 em memória, portanto, não é necessário configurar um banco de dados externo.

## Executando o Projeto
Siga estas etapas para executar o projeto:

Clone este repositório: git clone [URL do repositório]
Navegue até o diretório do projeto: cd [nome do diretório]
Execute o projeto usando o Maven: mvn spring-boot:run

## APIs

Adicionar Tarefa
Adiciona uma nova tarefa ao sistema.

URL: POST /tarefas

## Parâmetros de entrada (JSON):

```

{
    "descricao": "Descrição da tarefa"
}

```

Resposta de Sucesso (JSON):


```

{
    "id": 1,
    "descricao": "Descrição da tarefa",
    "concluida": false
}

```

Listar Tarefas

Lista todas as tarefas registradas no sistema.

URL: GET /tarefas

Resposta de Sucesso (JSON):




```


[
    {
        "id": 1,
        "descricao": "Tarefa 1",
        "concluida": false
    },
    {
        "id": 2,
        "descricao": "Tarefa 2",
        "concluida": true
    }
]
```

Marcar Tarefa como Concluída
Marca uma tarefa como concluída com base no ID da tarefa.

URL: PUT /tarefas/{id}

Parâmetros de URL:

id: ID da tarefa a ser marcada como concluída.
Resposta de Sucesso (JSON):


```

{
    "id": 1,
    "descricao": "Tarefa 1",
    "concluida": true
}

```

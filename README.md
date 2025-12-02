# 📋 Gerenciador de Tarefas

## 📖 Sobre o Projeto
Este projeto é um **Gerenciador de Tarefas** simples desenvolvido em **Java com Spring Boot**, utilizando o padrão arquitetural **MVC (Model-View-Controller)**.  
O objetivo é demonstrar como construir uma aplicação back-end organizada, com separação clara de responsabilidades entre **Model**, **Repository**, **Service** e **Controller**.  

A aplicação não possui front-end, sendo acessada exclusivamente por meio de **endpoints RESTful**.  
Ela permite realizar operações básicas de CRUD (Create, Read, Update, Delete) sobre uma entidade chamada **Tarefa**, que possui os atributos:
- `id` (identificador único)
- `descricao` (texto da tarefa)
- `status` (situação da tarefa, ex.: "Pendente", "Concluída")

---

## ⚙️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.5.8**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (em memória, para testes)
- **Spring Boot DevTools**
- **Spring Boot Test**

---

## 🚀 Como Executar
1. Clone o repositório:

   ```bash
   git clone https://github.com/Markevisky/gerenciador-tarefas-v2
   ```
2. execute o arquivo:

    ```
    run.bat
    ``` 
3. A aplicação estará disponível em:

    ```
    http://localhost:8080/tarefas
    ```
---
# 🌐 Endpoints Disponíveis
## Criar uma nova tarefa
- POST /tarefas
- Body (JSON):

    ```
    {
        "descricao": "Estudar Spring Boot",
        "status": "Pendente"
    }
    ```
## Listar todas as tarefas
- GET /tarefas
- Resposta (JSON):
    ```
    [
        {
            "id": 1,
            "descricao": "Estudar Spring Boot",
            "status": "Pendente"
        }
    ] 
    ```
## Atualizar uma tarefa existente
- PUT /tarefas/{id}
- Body (JSON):
    ```
    {
        "descricao": "Estudar Spring Boot",
        "status": "Concluída"
    }
    ```
Deletar uma tarefa
- DELETE /tarefas/{id}
- Resposta: HTTP 204 No Content
---
## 🗄️ Banco de Dados H2
O projeto utiliza o banco de dados em memória H2, que é iniciado junto com a aplicação.
Você pode acessar o console web em:

    
    http://localhost:8080/h2-console

- JDBC URL: jdbc:h2:mem:testdb
- User: sa
- Password: (em branco)

✅ Testes
O projeto inclui testes unitários e de integração utilizando Spring Boot Test.
Para rodar os testes:

    
    mvn test

## 📌 Conclusão
Este projeto serve como exemplo prático de como implementar uma aplicação back-end simples com Spring Boot e MVC, estruturando o código em camadas e expondo endpoints RESTful para operações CRUD.
Ele pode ser expandido com recursos adicionais como validação, autenticação e documentação de API com Swagger/OpenAPI.

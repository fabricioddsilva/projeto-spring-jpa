# Projeto Spring JPA
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/fabricioddsilva/projeto-spring-jpa/blob/main/LICENSE)

# Sobre o Projeto
Essa é uma aplicação acadêmica construida durante o meu percurso durante o curso: Java COMPLETO Programação Orientada a Objetos + Projetos, na Udemy [Udemy](https://www.udemy.com/ "Site da Udemy")  

A aplicação consiste em uma API para registro de usuários, produtos e pedidos, e também a manipulação desses dados.

## Tecnologias Utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Como executar o projeto
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone = https://github.com/fabricioddsilva/projeto-spring-jpa

# executar o projeto
./mvnw spring-boot:run
```

## Endpoints

  OBS.: os endpoints que tiverem {} representam que se deve passar o parametro pedido naquele local, não que deve ser construido desse jeito.  
  EX: O Endpoint _/users/{id}_ seria escrito assim: _/users/1_ assim trazendo o usuário com Id igual a 1.

#### Usuarios
- @GET _/users_ : Mostra a lista de todos os usuários.
- @GET _/users/{id}_ : Mostra o usuário de acordo com o Id passado.
- @POST _/users_ : Insere um usuário no banco de dados.
- @PUT _/users/{id}_ : Edita o usuário de acordo com o Id passado.
- @DELETE _/users/{id}_ : Deleta o usuário de acordo com o Id passado.

#### Produtos
- @GET _/products_ : Mostra a lista de todos os produtos.
- @GET _/products/{id}_ : Mostra o produto de acordo com Id passado.
  
#### Pedidos
- @GET _/orders_ : Mostra a lista de todos os pedidos.
- @GET _/orders/{id}_ : Mostra o pedido de acordo com Id passado.
  
#### Categorias
- @GET _/categories_ : Mostra a lista de todos as categorias.
- @GET _/categories/{id}_ : Mostra a categoria de acordo com Id passado.

---
Para ver o que eu aprendi durante esse curso, meu repositório https://github.com/fabricioddsilva/curso-java contem todos
os exercícios que eu fiz durante o curso.

# Autor

Fabrício Dias da Silva.  

https://www.linkedin.com/in/fabr%C3%ADcio-dias-860252247/

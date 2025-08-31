# ms-contatos

API de Contatos para o Pix.

## Descrição

Este é um projeto Spring Boot simples que expõe uma API REST para listar contatos. Atualmente, a lista de contatos é fixa e retorna uma lista de personagens do desenho animado Bob Esponja.

## Como usar

### Pré-requisitos

- Java 17 ou superior
- Maven

### Executando o projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/ms-contatos.git
```

2. Navegue até o diretório do projeto:
```bash
cd ms-contatos
```

3. Compile e execute o projeto usando o Maven:
```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

### Acessando a API

Para acessar a lista de contatos, faça uma requisição GET para o seguinte endpoint:

```
http://localhost:8080/ms-contatos/contatos
```

#### Exemplo de resposta

```json
[
    {
        "nome": "Bob Esponja Calça Quadrada",
        "especie": "Esponja Marinha",
        "profissao": "Cozinheiro"
    },
    {
        "nome": "Patrick Estrela",
        "especie": "Estrela do Mar",
        "profissao": "Desempregado"
    },
    {
        "nome": "Lula Molusco",
        "especie": "Polvo",
        "profissao": "Caixa"
    },
    {
        "nome": "Sr. Siriguejo",
        "especie": "Caranguejo",
        "profissao": "Dono do Siri Cascudo"
    },
    {
        "nome": "Sandy Bochechas",
        "especie": "Esquilo",
        "profissao": "Cientista"
    }
]
```

## Documentação da API (Swagger)

Para acessar a documentação da API e interagir com os endpoints, acesse o seguinte link:

```
http://localhost:8080/ms-contatos/swagger-ui.html
```

## Health Check

Para verificar a saúde da aplicação, acesse o seguinte endpoint:

```
http://localhost:8080/ms-contatos/actuator/health

```

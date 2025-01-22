# lab-padroes-projeto-spring

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)

Desafio de código desenvolvido durante bootcamp de Java na plataforma de ensino digital inovation one. 
O código é uma API REST documentada com swagger que consome dados relacionados ao cep informado por um cliente numa requisição http.

O swagger é um conjunto de ferramentas e especificações para projetar, documentar e testar APIs de forma eficiente. Ele utiliza o formato OpenAPI, permitindo descrever a estrutura de APIs RESTful de maneira padronizada e compreensível tanto por humanos quanto por máquinas. Com o Swagger UI, os desenvolvedores podem visualizar e interagir com as APIs diretamente no navegador. É amplamente usado para melhorar a colaboração e o desenvolvimento de APIs.

A API não permite a persistência de dados entre execuções, tendo sido utilizado um banco de dados H2 em memória.
Ele é criado ao iniciar a aplicação e descartado ao encerrá-la.


# Instalação
1. Clone o repositório:
````
git clone https://github.com/Ca7ulo/lab-padroes-projeto-spring
````
# Como rodar o projeto
1.Inicie o aplicativo com o Maven.

2.Acesse o seguinte endereço para visualizar a documentação da API:
```
http://localhost:8080/swagger-ui/index.html#.
```
  
# API Endpoints
```
GET /clientes - Mostrar todos os clientes cadastrados.
GET /clientes/id - Retornar um cliente pelo id.
POST /clientes - Adicionar um cliente.
PUT /clientes/id - Alterar info. de um cliente.
DELETE /clientes/id - Deletar um cliente pelo id.
```
### POST /clientes/id
##### REQUEST
```
{
"id":2,
"nome":"João",
"endereco":
{
"cep":"09951970"
}
}
```
##### RESPONSE
```
{
    "id": 2,
    "nome": "João",
    "endereco": {
        "cep": "09951-970",
        "logradouro": "Rua Antônio Dias Adorno",
        "complemento": "389",
        "bairro": "Vila Nogueira",
        "localidade": "Diadema",
        "uf": "SP",
        "ibge": "3513801",
        "gia": "2860",
        "ddd": "11",
        "siafi": "6377"
    }
}

```
### PUT /clientes
##### REQUEST
```
{
       "id": 4,
        "nome": "Júlia",
        "endereco": {
            "cep": "09951-970",
            "logradouro": "Rua Antônio Dias Adorno",
            "complemento": "389",
            "bairro": "Vila Nogueira",
            "localidade": "Diadema",
            "uf": "SP",
            "ibge": "3513801",
            "gia": "2860",
            "ddd": "11",
            "siafi": "6377"
    


        }
}
```
##### RESPONSE
```
{
       "id": 4,
        "nome": "Júlia",
        "endereco": {
            "cep": "09951-970",
            "logradouro": "Rua Antônio Dias Adorno",
            "complemento": "389",
            "bairro": "Vila Nogueira",
            "localidade": "Diadema",
            "uf": "SP",
            "ibge": "3513801",
            "gia": "2860",
            "ddd": "11",
            "siafi": "6377"
    


        }
}

```



# 📚 Documentação Booked

## [GET] Consultar Livros
    /api/books/
Retorna todos os livros salvos no banco de dados <br>
**Resposta:**

```json
{
  "autor": null,
  "livros": [
    {
      "nome": "A hora do cafe",
      "editora": "Estrela",
      "ano": 2025,
      "autor": "Machado de Assis",
      "genero": "Fantasia",
      "sinopse": "O livro acompanha a história de um programador que não vivem sem cafe",
      "isbn": "12345"
    }
  ]
}
```

## [POST] Registrar Livros
    /api/books/{author}

**Request Body:**
````json
{
  "autor": "Machado de Assis"
}
````
Cadastra os livros no banco de dados de um determinado autor <br>

## [GET] Consultar Livros por Autor
    /api/books/

**Exemplo:**
    
    /api/books/Machado%20de%20Assis
Retorna todos os livros salvos no banco de dados de um determinado autor <br>
**Resposta:**
```json
{
    "autor": "Machado de Assis",
    "livros":[
        {
            "nome":"A hora do cafe",
            "editora":"Estrela",
            "ano":2025,
            "autor":"Machado de Assis",
            "genero":"Fantasia",
            "sinopse":"O livro acompanha a história de um programador que não vivem sem cafe",
            "isbn":"12345"
        }
    ]
}
```

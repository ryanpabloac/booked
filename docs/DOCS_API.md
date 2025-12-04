# 📚 Documentação Booked

## [GET] Consultar Livros
    /api/books/
Retorna todos os livros salvos no banco de dados <br>
**Resposta:**
```json
{
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

## [POST] Registrar Livros
    /api/books/{author}
Cadastra os livros no banco de dados de um determinado autor <br>

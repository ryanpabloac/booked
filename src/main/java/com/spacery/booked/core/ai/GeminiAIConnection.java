package com.spacery.booked.core.ai;

import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentResponse;
import com.google.genai.types.Part;

public class GeminiAIConnection implements AIConnection {
    public Client client;

    public GeminiAIConnection(String apiKey) {
        this.client = Client.builder().apiKey(apiKey).build();
    }

    public String newAuthor(String authorName) {
        Content content = Content.fromParts(
            Part.fromText("Receba o nome de um autor abaixo e retorne um JSON com todos os livros encontrados do autor."+
                    "Cada livro deve incluir: nome, editora, ano, autor, ISBN, gênero (apenas um) e sinopse."+
                    "Saída exclusivamente em JSON. Quero que retorne o nome do autor (use a chave como 'autor') e uma lista de livros (use a chave como 'livros') com as informações"),
                Part.fromText("Nome do autor: " + authorName)
        );

        GenerateContentResponse response = this.client.models
                .generateContent("gemini-2.5-flash",content, null);

        return response.text();
    }
}

package com.spacery.booked.core.utils;

import com.google.gson.Gson;
import com.spacery.booked.core.entities.Book;
import lombok.Getter;

import java.util.List;


@Getter
public class BookJson {
    List<Book> livros;

    public BookJson(String booksJson) {
        Gson gson = new Gson();
        String json = clean(booksJson);

        livros = gson.fromJson(json, BookJson.class).getLivros();
    }

    private String clean(String json) {
        json = json.replace("```json", "");
        json = json.replace("```", "");
        return json.trim();
    }
}

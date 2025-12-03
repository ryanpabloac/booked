package com.spacery.booked.api.response;

import com.spacery.booked.core.entities.Book;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BooksResponse {
    private List<Book> livros;
}

package com.spacery.booked.api;

import com.spacery.booked.api.response.BooksResponse;
import com.spacery.booked.api.repository.BookRepository;
import com.spacery.booked.core.ai.GeminiAIConnection;
import com.spacery.booked.core.entities.Book;
import com.spacery.booked.core.utils.BookJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @Value("${API_KEY}")
    private String apiKey;
    private final BookRepository bookRepository;

    public Controller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/api/books")
    @ResponseBody
    public BooksResponse getBooks() {
        BooksResponse response = new BooksResponse();
        response.setLivros(bookRepository.findAll());

        return response;
    }

    @PostMapping("/api/books")
    public void addBooks(@RequestBody String author) {
        GeminiAIConnection gemini = new GeminiAIConnection(apiKey);
        String json = gemini.newAuthor(author);

        BookJson bookJson = new BookJson(json);
        bookRepository.saveAll(bookJson.getLivros());

    }

    @GetMapping("/api/books/{author}")
    public BooksResponse getBooksByAuthor(@PathVariable("author") String author) {
        BooksResponse response = new BooksResponse();
        response.setLivros(bookRepository.findBooksByAutor(author));

        return response;
    }
}

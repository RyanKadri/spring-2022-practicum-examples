package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookController {

    @GetMapping("/books")
    public String fetchBooks() {
        return "Success";
    }

    @GetMapping("/books/{author}/{bookId}")
    public Book fetchBook(String author, String bookId) {

    }

    @PostMapping("/books")
    public String createBook(@RequestBody Book newBook) {
        return "Success";
    }
}

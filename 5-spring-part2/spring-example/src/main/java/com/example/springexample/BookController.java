package com.example.springexample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class BookController {

    @GetMapping("/books/{bookId}")
    public Book fetchBooksABC(@PathVariable Integer bookId) {
        if(bookId < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This book does not exist");
        } else {
            return new Book(bookId,"To Kill a Mockingbird", "Harper Lee");
        }
    }
}

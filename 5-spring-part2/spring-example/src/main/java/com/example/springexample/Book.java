package com.example.springexample;

public class Book {
    private final Integer id;
    private final String name;
    private final String author;

    public Book(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getId() {
        return id;
    }
}

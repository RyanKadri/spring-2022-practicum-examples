package com.example.diexample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotesDbService implements NotesDbInterface {

    private final List<String> notes = new ArrayList<>();

    public List<String> fetchNotes() {
        return notes;
    }
}

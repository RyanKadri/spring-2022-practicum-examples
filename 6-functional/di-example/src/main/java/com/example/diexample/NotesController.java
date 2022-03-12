package com.example.diexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotesController {

    private final NotesDbInterface notesDb;

    @Autowired
    NotesController(NotesDbInterface notesDb) {
        this.notesDb = notesDb;
    }

    @GetMapping("/notes")
    public List<String> fetchNote() throws Exception {
        var notes = this.notesDb.fetchNotes();
        if(notes.size() == 0) {
            throw new Exception("Could not find note");
        } else {
            return notes;
        }
    }

}

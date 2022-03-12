package com.example.diexample;

import java.util.List;

public class MockNotesDb implements NotesDbInterface {

    private final List<String> mockedNotes;

    public MockNotesDb(List<String> mockedNotes) {
        this.mockedNotes = mockedNotes;
    }

    @Override
    public List<String> fetchNotes() {
        return mockedNotes;
    }
}

package com.example.diexample;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotesControllerTest {

    @Test
    void fetchNote() throws Exception {
        var mockDb = new MockNotesDb(List.of("Note1", "Note2"));
        NotesController controller = new NotesController(mockDb);
        var res = controller.fetchNote();
        assertEquals(List.of("Note1", "Note2"), res);
    }

    @Test
    void throwsOnNoNotes() throws Exception {
        var mockDb = new MockNotesDb(List.of());
        NotesController controller = new NotesController(mockDb);
        assertThrows(Exception.class, () -> {
            controller.fetchNote();
        });
    }
}
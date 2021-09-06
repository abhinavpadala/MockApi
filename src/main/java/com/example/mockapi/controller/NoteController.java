package com.example.mockapi.controller;

import com.example.mockapi.entity.Note;
import com.example.mockapi.services.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.mockapi.HelperClass.HelperClass;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteServices noteServices;

    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping("/addNote")
    public ResponseEntity<Note> addNote(@RequestBody Note note) {
        if (HelperClass.isValidInput(note.getNote())) {
            return ResponseEntity.ok(this.noteServices.createNote(note));
        } else {
            System.out.println("--Bad request--");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/search")
    public List<Note> searchNotes(@Param("keyword") String keyword) {
            List<Note> notes = noteServices.listAll(keyword);
            return notes;
    }
}

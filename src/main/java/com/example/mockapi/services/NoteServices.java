package com.example.mockapi.services;

import com.example.mockapi.entity.Note;
import com.example.mockapi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoteServices {
    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> listAll(String keyword) {
        if(keyword != null){
            return noteRepository.searchNotes(keyword);
        }
        return noteRepository.findAll();
    }
}

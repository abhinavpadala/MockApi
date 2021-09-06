package com.example.mockapi.repository;

import com.example.mockapi.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    @Query("SELECT n FROM Note n where n.note LIKE %?1%")
    List<Note> searchNotes(String keyword);
}

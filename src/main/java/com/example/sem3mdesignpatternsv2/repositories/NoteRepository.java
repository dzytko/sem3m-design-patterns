package com.example.sem3mdesignpatternsv2.repositories;

import com.example.sem3mdesignpatternsv2.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}

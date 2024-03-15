package com.example.sem3mdesignpatternsv2.controllers;

import com.example.sem3mdesignpatternsv2.entities.Note;
import com.example.sem3mdesignpatternsv2.repositories.NoteRepository;
import com.example.sem3mdesignpatternsv2.utils.textModifiers.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteController {
    private final NoteRepository noteRepository;

    @GetMapping
    public ResponseEntity<List<Note>> getNotes() {
        return ResponseEntity.ok(noteRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNote(@PathVariable Long id) {
        return ResponseEntity.ok(noteRepository.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        noteRepository.save(note);
        return ResponseEntity.ok(note);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) {
        noteRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/toLower")
    public ResponseEntity<Note> modifyNoteToLower(@PathVariable Long id) {
        return modifyNoteById(id, new LowerModifier());
    }

    @PostMapping("/{id}/toUpper")
    public ResponseEntity<Note> modifyNoteToUpper(@PathVariable Long id) {
        return modifyNoteById(id, new UpperModifier());
    }

    @PostMapping("/{id}/reverse")
    public ResponseEntity<Note> modifyNoteReverse(@PathVariable Long id) {
        return modifyNoteById(id, new ReverseAdapter());
    }

    private ResponseEntity<Note> modifyNoteById(Long noteID, TextModifier modifier) {
        var noteModifier = new NoteModifier(modifier);
        Note note = noteRepository.findById(noteID).orElse(null);
        if (note == null) {
            return ResponseEntity.notFound().build();
        }
        if (note.getContent() == null) {
            return ResponseEntity.badRequest().build();
        }
        note = noteModifier.modifyNote(note);
        noteRepository.save(note);
        return ResponseEntity.ok(note);
    }

}

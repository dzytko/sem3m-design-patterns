package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.entities.Note;
import lombok.Getter;
import lombok.Setter;

// Odrwacanie zależności
@Setter
@Getter
public class NoteModifier {
    private TextModifier modifier;

    public NoteModifier(TextModifier newModifier) {
        this.modifier = newModifier;
    }

    public Note modifyNote(Note note) {
        note.setContent(modifier.modify(note.getContent()));
        return note;
    }
}

package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.entities.Note;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoteModifierFacade {

    public Note upAndReverse(Note note) {
        var textModifierList = new TextModifier[]{new UpperModifier(), new ReverseAdapter()};
        var textModifier = new TextMultiModifier(textModifierList);
        note.setContent(textModifier.modify(note.getContent()));
        return note;
    }

    public Note lowerAndReverse(Note note) {
        var lowerText = new ModifierProxy(new LowerModifier()).modify(note.getContent());
        var reversedText = new ModifierProxy(new ReverseAdapter()).modify(lowerText);
        note.setContent(reversedText);
        return note;
    }

}

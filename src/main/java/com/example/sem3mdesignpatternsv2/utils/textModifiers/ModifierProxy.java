package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.utils.logging.AppLoggerProvider;

import java.util.HashMap;

public class ModifierProxy implements TextModifier {
    private final TextModifier modifier;


    public ModifierProxy(TextModifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public String modify(String text) {
        if (!NoteModifierFlyweight.getInstance().contains(text, modifier)) {
            NoteModifierFlyweight.getInstance().put(text, modifier.modify(text), modifier);
            System.out.println("Text modified: " + text);
        } else {
            System.out.println("Text already modified: " + text);
        }

        return NoteModifierFlyweight.getInstance().get(text, modifier);
    }
}

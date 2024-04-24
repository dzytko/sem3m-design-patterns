package com.example.sem3mdesignpatternsv2.utils.textModifiers;


public class TextMultiModifier {
    private final TextModifier[] modifiers;

    public TextMultiModifier(TextModifier[] modifiers) {
        this.modifiers = modifiers;
    }

    public String modify(String text) {
        for (TextModifier modifier : modifiers) {
            text = modifier.modify(text);
        }
        return text;
    }
}

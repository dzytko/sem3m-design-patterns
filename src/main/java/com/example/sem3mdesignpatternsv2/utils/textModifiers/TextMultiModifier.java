package com.example.sem3mdesignpatternsv2.utils.textModifiers;


import java.util.Arrays;

public class TextMultiModifier {
    private final TextModifier[] modifiers;

    public TextMultiModifier(TextModifier[] modifiers) {
        this.modifiers = modifiers;
    }

    public String modify(String text) {
        return Arrays.stream(modifiers)
                .reduce(text, (modifiedText, modifier) -> modifier.modify(modifiedText), (a, b) -> b);

    }
}

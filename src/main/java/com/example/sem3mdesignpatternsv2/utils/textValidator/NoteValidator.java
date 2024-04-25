package com.example.sem3mdesignpatternsv2.utils.textValidator;

// Odwracanie zależności
public class NoteValidator{
    private final TextValidator textValidator;

    public NoteValidator(TextValidator textValidator) {
        this.textValidator = textValidator;
    }

    public boolean validate(String text) {
        return textValidator.validate(text);
    }
}

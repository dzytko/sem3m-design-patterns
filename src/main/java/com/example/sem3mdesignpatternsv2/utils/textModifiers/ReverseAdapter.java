package com.example.sem3mdesignpatternsv2.utils.textModifiers;

public class ReverseAdapter implements TextModifier{
    @Override
    public String modify(String text) {
        return new ReverseModifier().reverse(text);
    }
}

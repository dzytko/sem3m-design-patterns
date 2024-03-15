package com.example.sem3mdesignpatternsv2.utils.textModifiers;

public class LowerModifier implements TextModifier{

    @Override
    public String modify(String text) {
        return text.toLowerCase();
    }
}

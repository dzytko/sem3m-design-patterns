package com.example.sem3mdesignpatternsv2.utils.textModifiers;

public class LowerLoggingModifier extends LowerModifier{
    @Override
    public String modify(String text) {
        System.out.println("LowerLoggingModifier: " + text);
        return super.modify(text);
    }
}

package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.utils.functionInterfaces.StringModifier;

public class ToLower implements StringModifier {
    @Override
    public String modify(String input) {
        return input.toLowerCase();
    }
}

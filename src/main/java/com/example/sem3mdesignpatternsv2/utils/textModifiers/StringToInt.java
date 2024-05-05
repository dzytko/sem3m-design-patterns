package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.utils.functionInterfaces.StringConverter;

public class StringToInt implements StringConverter {
    @Override
    public int convert(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Input is not a valid integer!");
            return -1;
        }
    }
}

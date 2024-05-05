package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import com.example.sem3mdesignpatternsv2.utils.functionInterfaces.StringValidator;

public class IsUpper implements StringValidator {
    @Override
    public boolean validate(String input) {
        return input.equals(input.toUpperCase());
    }
}

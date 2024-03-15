package com.example.sem3mdesignpatternsv2.utils.textModifiers;

public class ReverseModifier {
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

package com.example.sem3mdesignpatternsv2.utils.textValidator;

public class LowerValidator implements TextValidator {

        @Override
        public boolean validate(String text) {
            return text != null && text.equals(text.toLowerCase());
        }
}

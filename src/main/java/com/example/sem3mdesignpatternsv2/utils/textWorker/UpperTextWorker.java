package com.example.sem3mdesignpatternsv2.utils.textWorker;

import com.example.sem3mdesignpatternsv2.utils.textModifiers.TextModifier;
import com.example.sem3mdesignpatternsv2.utils.textValidator.TextValidator;

public class UpperTextWorker implements TextModifier, TextValidator {

        @Override
        public String modify(String text) {
            return text.toUpperCase();
        }

        @Override
        public boolean validate(String text) {
            return text.equals(text.toUpperCase());
        }
}

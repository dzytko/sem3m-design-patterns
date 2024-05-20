package com.example.sem3mdesignpatternsv2.utils.textValidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UpperValidatorTest {

    private final UpperValidator upperValidator = new UpperValidator();

    @Test
    void testValidateUpperCaseString() {
        String input = "HELLO";
        boolean result = upperValidator.validate(input);
        assertTrue(result, "The string 'HELLO' should be considered valid.");
    }

    @Test
    void testValidateLowerCaseString() {
        String input = "hello";
        boolean result = upperValidator.validate(input);
        assertFalse(result, "The string 'hello' should be considered invalid.");
    }

    @Test
    void testValidateMixedCaseString() {
        String input = "Hello";
        boolean result = upperValidator.validate(input);
        assertFalse(result, "The string 'Hello' should be considered invalid.");
    }

    @Test
    void testValidateEmptyString() {
        String input = "";
        boolean result = upperValidator.validate(input);
        assertTrue(result, "An empty string should be considered valid as it has no lowercase letters.");
    }

    @Test
    void testValidateNullInput() {
        String input = null;
        boolean result = upperValidator.validate(input);
        assertFalse(result, "Null input should be considered invalid.");
    }
}
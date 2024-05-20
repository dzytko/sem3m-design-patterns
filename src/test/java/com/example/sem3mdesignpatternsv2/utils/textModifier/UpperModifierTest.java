package com.example.sem3mdesignpatternsv2.utils.textModifier;

import com.example.sem3mdesignpatternsv2.utils.textModifiers.UpperModifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UpperModifierTest {

    private final UpperModifier upperModifier = new UpperModifier();

    @Test
    void testToUpperCaseRegularString() {
        String input = "hello";
        String expected = "HELLO";
        String result = upperModifier.modify(input);
        assertEquals(expected, result);
    }

    @Test
    void testToUpperCaseEmptyString() {
        String input = "";
        String expected = "";
        String result = upperModifier.modify(input);
        assertEquals(expected, result);
    }

    @Test
    void testToUpperCaseSingleCharacter() {
        String input = "a";
        String expected = "A";
        String result = upperModifier.modify(input);
        assertEquals(expected, result);
    }

    @Test
    void testToUpperCaseStringWithSpecialCharacters() {
        String input = "a!b@c#";
        String expected = "A!B@C#";
        String result = upperModifier.modify(input);
        assertEquals(expected, result);
    }

    @Test
    void testToUpperCaseNullInput() {
        String input = null;
        String result = upperModifier.modify(input);
        assertNull(result);
    }
}

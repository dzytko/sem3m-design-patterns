package com.example.sem3mdesignpatternsv2.utils.textModifier;

import com.example.sem3mdesignpatternsv2.utils.textModifiers.ReverseModifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseModifierTest {

    private final ReverseModifier reverseModifier = new ReverseModifier();

    @Test
    void testReverseRegularString() {
        String input = "hello";
        String expected = "olleh";
        String result = reverseModifier.reverse(input);
        assertEquals(expected, result);
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        String result = reverseModifier.reverse(input);
        assertEquals(expected, result);
    }

    @Test
    void testReverseSingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = reverseModifier.reverse(input);
        assertEquals(expected, result);
    }

    @Test
    void testReversePalindrome() {
        String input = "madam";
        String expected = "madam";
        String result = reverseModifier.reverse(input);
        assertEquals(expected, result);
    }

    @Test
    void testReverseStringWithSpecialCharacters() {
        String input = "a!b@c#";
        String expected = "#c@b!a";
        String result = reverseModifier.reverse(input);
        assertEquals(expected, result);
    }
}
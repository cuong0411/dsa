package org.cuong.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    @Test
    void testIsAnagram_OneStringEmpty() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("", "nonempty"));
    }

    @Test
    void testIsAnagram_IdenticalSingleCharacterStrings() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("a", "a"));
    }

    @Test
    void testIsAnagram_true() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("cat", "act"));
    }

    @Test
    void testIsAnagram_DifferentLengths() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testIsAnagram_SameCharactersDifferentFrequencies() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("aabbcc", "abc"));
    }

}

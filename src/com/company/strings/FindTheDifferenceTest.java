package com.company.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    @Test
    void uniqueCharInString() {
        FindTheDifference difference = new FindTheDifference();
        assertEquals('g',difference.findTheDifference("abcdef","abcdefg"));
    }

    @Test
    void multipleOfSameCharInString() {
        FindTheDifference difference = new FindTheDifference();
        assertEquals('c',difference.findTheDifference("abcdefgabdefg","abcdefgabcdefg"));
    }
}
package com.company.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

    @Test
    void restoreString() {
        ShuffleString shuffleString = new ShuffleString();
        assertEquals("hey", shuffleString.restoreString("eyh", new  int[]{1,2,0}));
    }
}
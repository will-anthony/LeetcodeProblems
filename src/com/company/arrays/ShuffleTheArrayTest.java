package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void shuffle() {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        assertArrayEquals(new int[]{1,4,2,5,3,6},shuffleTheArray.shuffle(new int[]{1,2,3,4,5,6}, 3));
    }
}
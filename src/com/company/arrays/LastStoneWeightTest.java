package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    @Test
    void testForZero() {
        LastStoneWeight stoneWeight = new LastStoneWeight();
        assertEquals(0, stoneWeight.lastStoneWeight(new int[]{2,4,4,2}));
    }

    @Test
    void testForOne() {
        LastStoneWeight stoneWeight = new LastStoneWeight();
        assertEquals(1, stoneWeight.lastStoneWeight(new int[]{2,4,4,3}));
    }

    @Test
    void testForOddArrayLength() {
        LastStoneWeight stoneWeight = new LastStoneWeight();
        assertEquals(2, stoneWeight.lastStoneWeight(new int[]{2,4,4,3,3}));
    }

}
package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {

    @Test
    void numIdenticalPairs() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        assertEquals(2, goodPairs.numIdenticalPairs(new int[]{1,6,4,78,3,1,3,8}));
    }
}
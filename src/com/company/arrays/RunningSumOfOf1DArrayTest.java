package com.company.arrays;

import static org.junit.jupiter.api.Assertions.*;
class RunningSumOfOf1DArrayTest {

    @org.junit.jupiter.api.Test
    void checkSmallSumArray() {
        RunningSumOfOf1DArray runningSumOfOf1DArray = new RunningSumOfOf1DArray();
        assertArrayEquals(new int[]{1,2,3,4,5}, runningSumOfOf1DArray.runningSum(new int[] {1,1,1,1,1}));
    }
}
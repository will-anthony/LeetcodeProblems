package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeSortArrayTest {

    @Test
    void relativeSortArray() {
        RelativeSortArray sortArray = new RelativeSortArray();
        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19}, sortArray.relativeSortArray
                (new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }
}
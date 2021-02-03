package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersSmallerThanCurrentTest {

    @Test
    void smallerNumbersThanCurrent() {
        HowManyNumbersSmallerThanCurrent hMNSTC = new HowManyNumbersSmallerThanCurrent();
        assertArrayEquals(new int[]{4,0,1,1,3}, hMNSTC.smallerNumbersThanCurrent(new int []{8,1,2,2,3}));
    }
}
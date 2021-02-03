package com.company.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterBottlesTest {

    @Test
    void numCompletelyDivisible() {
        WaterBottles waterBottles = new WaterBottles();
        assertEquals(13, waterBottles.numWaterBottles(9, 3));
    }

    @Test
    void numHasRemainder() {
        WaterBottles waterBottles = new WaterBottles();
        assertEquals(19, waterBottles.numWaterBottles(15, 4));
    }
}
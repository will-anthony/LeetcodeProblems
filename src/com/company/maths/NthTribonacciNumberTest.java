package com.company.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {

    @Test
    void tribonacci() {
        NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();
        assertEquals(1389537, nthTribonacciNumber.tribonacci(25));
    }
}
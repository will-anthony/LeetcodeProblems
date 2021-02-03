package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefuseTheBombTest {

    @Test
    void decryptWhereKIsPositive() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        assertArrayEquals(new int[]{6,5,4,5}, defuseTheBomb.decrypt(new int[]{3,2,4,1}, 2));
    }

    @Test
    void decryptWhereKIsNegative() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        assertArrayEquals(new int[]{4,3,5}, defuseTheBomb.decrypt(new int[]{2,3,1}, -2));
    }
}
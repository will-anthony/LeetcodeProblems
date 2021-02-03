package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLuckyIntegerInArrayTest {

    @Test
    void findLuckyWithAnswer3() {
        FindLuckyIntegerInArray luck = new FindLuckyIntegerInArray();
        assertEquals(3, luck.findLucky(new int[]{1,2,3,6,5,3,3}));
    }

    @Test
    void findLuckyWithAll0() {
        FindLuckyIntegerInArray luck = new FindLuckyIntegerInArray();
        assertEquals(-1, luck.findLucky(new int[]{0,0,0,0,0,0,0}));
    }
    @Test
    void findLuckyWithAll1() {
        FindLuckyIntegerInArray luck = new FindLuckyIntegerInArray();
        assertEquals(-1, luck.findLucky(new int[]{1,1,1,1,1,1,1,1,1,1}));
    }
}

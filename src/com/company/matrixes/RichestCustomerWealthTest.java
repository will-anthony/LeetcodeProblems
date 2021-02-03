package com.company.matrixes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    void maximumWealth() {
        RichestCustomerWealth wealth = new RichestCustomerWealth();
        assertEquals(6, wealth.maximumWealth(new int[][]{{1,2,3},{1,2,1}, {1,0,0}}));
    }
}
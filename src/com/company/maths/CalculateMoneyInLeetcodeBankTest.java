package com.company.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetcodeBankTest {

    @Test
    void lessThanOneWeekDepositingMoney() {
        CalculateMoneyInLeetcodeBank calculateMoneyInLeetcodeBank = new CalculateMoneyInLeetcodeBank();
        assertEquals(10, calculateMoneyInLeetcodeBank.totalMoney(4));
    }

    @Test
    void moreThanOneWeekDepositingMoney() {
        CalculateMoneyInLeetcodeBank calculateMoneyInLeetcodeBank = new CalculateMoneyInLeetcodeBank();
        assertEquals(96, calculateMoneyInLeetcodeBank.totalMoney(20));
    }

    @Test
    void initialSeven() {
        CalculateMoneyInLeetcodeBank calculateMoneyInLeetcodeBank = new CalculateMoneyInLeetcodeBank();
        assertEquals(21, calculateMoneyInLeetcodeBank.initialSeven(6, 0));
    }
}
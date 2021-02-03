package com.company.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIPAddressTest {

    @Test
    void allZerosIPAddress() {
        DefangingAnIPAddress defangger = new DefangingAnIPAddress();
        assertEquals("0[.]0[.]0[.]0", defangger.defangIPaddr("0.0.0.0"));
    }
}
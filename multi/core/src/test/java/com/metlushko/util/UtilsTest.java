package com.metlushko.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsTest {

    @Test
    void isAllPositiveNumber() {
        assertFalse(Utils.isAllPositiveNumber("123", "12"));
    }
}
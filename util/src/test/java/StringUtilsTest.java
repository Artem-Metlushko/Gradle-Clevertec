package com.metlushko.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertFalse(StringUtils.isPositiveNumber("123"));

    }
}
package ru.clevertec.mp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        Utils utils = new Utils();
        boolean res = utils.isAllPositiveNumbers("2.5", "5.8");
        assertTrue(res);
    }
}
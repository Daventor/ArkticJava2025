package com.ironhack.d1;

import com.ironhack.w2.d1.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumNumbers_validValues_assertOK() {
        int sumResult = Main.sumNumbers(2, 3);
        assertEquals(5, sumResult);

    }
}
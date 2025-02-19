package com.ironhack.d2;

import com.ironhack.w2.d2.MathLibrary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    @Test
    void multiply_smallInts_correctProduct() {
        assertEquals(10, MathLibrary.multiply(2,5));
    }

    @Test
    void multiply_largeInts_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            MathLibrary.multiply(900_000_000, 400_000_000);
        });
    }
}
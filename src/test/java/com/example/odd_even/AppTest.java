package com.example.odd_even;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", App.checkOddEven(4));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", App.checkOddEven(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", App.checkOddEven(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Odd", App.checkOddEven(-3));
    }
}

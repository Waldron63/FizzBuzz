package com.example.fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}

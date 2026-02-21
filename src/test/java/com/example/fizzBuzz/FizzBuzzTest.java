package com.example.fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    void testFizzBuzzMultiplo0() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0));
    }

    @Test
    void testFizzBuzzMultiplo3Negativo() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(-3));
    }

    @Test
    void testFizzBuzzMultiplo5Negativo() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(-5));
    }

    @Test
    void testFizzBuzzMultiplo3y5Negativo() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    void testFizzBuzzReturnsNegativeNumber() {
        assertEquals("-4", FizzBuzz.fizzbuzz(-4));
    }
}

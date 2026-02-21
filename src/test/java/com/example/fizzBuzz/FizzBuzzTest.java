package com.example.fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void given_FizzBuzz_When_Input1_Then_Expected1() {
        // Arrange
        int input = 1;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("1", result);
    }

    @Test
    void given_FizzBuzz_When_Input3_Then_ExpectedFizz() {
        // Arrange
        int input = 3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void given_FizzBuzz_When_Input5_Then_ExpectedBuzz() {
        // Arrange
        int input = 5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void given_FizzBuzz_When_Input15_Then_ExpectedFizzBuzz() {
        // Arrange
        int input = 15;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void given_FizzBuzz_When_Input0_Then_ExpectedFizzBuzz() {
        // Arrange
        int input = 0;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void given_FizzBuzz_When_InputMinus3_Then_ExpectedFizz() {
        // Arrange
        int input = -3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void given_FizzBuzz_When_InputMinus5_Then_ExpectedBuzz() {
        // Arrange
        int input = -5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void given_FizzBuzz_When_InputMinus15_Then_ExpectedFizzBuzz() {
        // Arrange
        int input = -15;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void given_FizzBuzz_When_InputMinus4_Then_Expected1() {
        // Arrange
        int input = -4;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("-4", result);
    }
}

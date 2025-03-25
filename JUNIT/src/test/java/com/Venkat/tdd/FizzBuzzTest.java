package com.Venkat.tdd;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @DisplayName("Divisible by 3")
    @Test
    @Order(1)
    void testDivisibleByThree() {
        String expected = "Fizz";
        assertEquals(expected, Fizzbuzz.compute(3), "If the number is divisible by 3, should return Fizz");
    }

    @DisplayName("Divisible by 5")
    @Test
    @Order(2)
    void testDivisibleByFive() {
        String expected = "Buzz";
        assertEquals(expected, Fizzbuzz.compute(5), "If the number is divisible by 5, should return Buzz");
    }

    @DisplayName("Divisible by 3 and 5")
    @Test
    @Order(3)
    void testDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";
        assertEquals(expected, Fizzbuzz.compute(15), "If the number is divisible by 15, should return FizzBuzz");
    }

    @DisplayName("Not Divisible by 3 and 5")
    @Test
    @Order(4)
    void testNotDivisibleByThreeAndFive() {
        String expected = "1";
        assertEquals(expected, Fizzbuzz.compute(1), "If the number is not divisible by 3 and 5, should return same number");
    }

    @DisplayName("Test with CSV data")
    @Order(5)
    @ParameterizedTest(name = "Value = {0}, Expected = {1}")
    @CsvFileSource(resources = "/sample-data-file.csv", numLinesToSkip = 1)
    void testWithCSVData(int value, String expected) {
        assertEquals(expected, Fizzbuzz.compute(value));
    }

}


package com.example.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Fibonacci sequence is calculated")
    void calculate() throws NegativeValueException {
        Fibonacci fibonacci = new Fibonacci();
        int n = 6;
        long[] expected = {0, 1, 1, 2, 3, 5};
        assertArrayEquals(expected, fibonacci.calculate(n));
    }
    @Test
    @DisplayName("Fibonacci sequence is calculated")
    void calculate1() throws NegativeValueException {
        Fibonacci fibonacci = new Fibonacci();
        int n = 9;
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(expected, fibonacci.calculate(n));
    }
    @Test
    @DisplayName("Fibonacci sequence is calculated")
    void calculate2() throws NegativeValueException {
        Fibonacci fibonacci = new Fibonacci();
        int n = 0;
        long[] expected = {0};
        assertArrayEquals(expected, fibonacci.calculate(n));
    }
    @Test
    @DisplayName("Fibonacci sequence is calculated")
    void calculate3() throws NegativeValueException {
        Fibonacci fibonacci = new Fibonacci();
        int n = 1;
        long[] expected = {0, 1};
        assertArrayEquals(expected, fibonacci.calculate(n));
    }
}
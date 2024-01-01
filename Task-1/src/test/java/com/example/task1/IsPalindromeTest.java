package com.example.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    @DisplayName("Number is Palindrome!")
    void isPalindrome() throws NegativeValueException {
        IsPalindrome isPalindrome = new IsPalindrome();
        long num = 123321;
        assertTrue(isPalindrome.isPalindrome(num));
    }
    @Test
    @DisplayName("Number isn't Palindrome!")
    void isPalindrome1() throws NegativeValueException {
        IsPalindrome isPalindrome = new IsPalindrome();
        long num = 1233211;
        assertFalse(isPalindrome.isPalindrome(num));
    }
}
package com.example.task1;

public class IsPalindrome {
    public boolean isPalindrome(long num) throws NegativeValueException {
        if(num < 0) throw new NegativeValueException("Number is negative! Cannot be palindrome!");
        else {
            long number = num, reverse = 0;
            while(number != 0)
            {
                long remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            return num == reverse;
        }
    }
}

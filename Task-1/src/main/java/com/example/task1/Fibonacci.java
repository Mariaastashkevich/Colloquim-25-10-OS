package com.example.task1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fibonacci {
    private long[] fibSequence;
    long[] calculate(int n) throws NegativeValueException {
        if(n < 0) {throw new NegativeValueException("N is lesser than zero! Factorial cannot be calculated.");}
            if(n == 0) return new long[]{0};
            else if(n == 1) return new long[]{0, 1};
            else {
                fibSequence = new long[n];
                fibSequence[0] = 0;
                fibSequence[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
            return fibSequence;
        }
    }

}

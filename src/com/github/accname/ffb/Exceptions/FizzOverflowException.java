package com.github.accname.ffb.Exceptions;

public class FizzOverflowException extends Exception {
    final private String fizzbuzz;
    final private int fizzbuzzamnt;
    public int getAmount() {
        return fizzbuzzamnt;
    }
    public int overBy() {
        return fizzbuzzamnt - 100;
    }
    public FizzOverflowException(int Amount) {
        fizzbuzz = "fizz";
        this.fizzbuzzamnt = Amount;
    }
}

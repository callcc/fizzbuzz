package com.github.accname.ffb.Exceptions;

public class BuzzOverflowException extends Exception {
    private String fizzbuzz;
    private int fizzbuzzamnt;
    public int getAmount() {
        return fizzbuzzamnt;
    }
    public int overBy() {
        return fizzbuzzamnt - 100;
    }
    public BuzzOverflowException(int Amount) {
        fizzbuzz = "buzz";
        this.fizzbuzzamnt = Amount;
    }
}

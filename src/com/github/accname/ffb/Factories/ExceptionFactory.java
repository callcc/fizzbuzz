package com.github.accname.ffb.Factories;

import com.github.accname.ffb.Exceptions.BuzzOverflowException;
import com.github.accname.ffb.Exceptions.FizzOverflowException;

public class ExceptionFactory {
    private static int fizzbuzzint;

    public ExceptionFactory(int overflow) {
        fizzbuzzint = overflow;
    }

    public static void getException(String exceptionType) throws BuzzOverflowException, FizzOverflowException {
        if (exceptionType == null) {
            return;
        }
        if (exceptionType.equalsIgnoreCase("buzz")) {
            throw new BuzzOverflowException(fizzbuzzint);
        } else if (exceptionType.equalsIgnoreCase("fizz")) throw new FizzOverflowException(fizzbuzzint);
    }
}

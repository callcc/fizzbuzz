package com.github.accname.ffb.FactoryClasses;

import com.github.accname.ffb.Exceptions.BuzzOverflowException;
import com.github.accname.ffb.Exceptions.FizzOverflowException;
import com.github.accname.ffb.Printers.StrPrinter;
import com.github.accname.ffb.Factories.ExceptionFactory;

public class FizzPrint implements StrPrinter {
    private int inFizz;

    @Override
    public void print() throws FizzOverflowException, BuzzOverflowException {
        if(inFizz > 100) {
            ExceptionFactory except;
            except = new ExceptionFactory(inFizz);
            except.getException("fizz");
        }
        inFizz++;
        System.out.print("Fizz");
    }
}
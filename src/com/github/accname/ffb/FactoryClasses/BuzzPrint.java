package com.github.accname.ffb.FactoryClasses;

import com.github.accname.ffb.Exceptions.BuzzOverflowException;
import com.github.accname.ffb.Exceptions.FizzOverflowException;
import com.github.accname.ffb.Printers.StrPrinter;
import com.github.accname.ffb.Factories.ExceptionFactory;

public class BuzzPrint implements StrPrinter {
    private int inBuzz;

    @Override
    public void print() throws FizzOverflowException, BuzzOverflowException {
        if(inBuzz > 100) {
            ExceptionFactory except;
            except = new ExceptionFactory(inBuzz);
            except.getException("buzz");
        }
        inBuzz++;
        System.out.print("Buzz");
    }
}

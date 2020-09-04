package com.github.accname.libfizzbuzz.FactoryClasses;

import com.github.accname.libfizzbuzz.Printers.StrPrinter;

public class FizzPrint implements StrPrinter {
    @Override
    public void print() {
        System.out.print("Fizz");
    }
}
package com.github.accname.libfizzbuzz.FactoryClasses;

import com.github.accname.libfizzbuzz.Printers.StrPrinter;

public class BuzzPrint implements StrPrinter {
    @Override
    public void print() {
        System.out.print("Buzz");
    }
}

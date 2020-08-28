package com.github.accname.ffb.FactoryClasses;

import com.github.accname.ffb.Printers.IntPrinter;

public class NumberPrint implements IntPrinter {
    final int integerToPrint;
    public NumberPrint(int num) {
        integerToPrint = num;
    }
    @Override
    public void printInteger() {
        System.out.print(integerToPrint);
    }
}

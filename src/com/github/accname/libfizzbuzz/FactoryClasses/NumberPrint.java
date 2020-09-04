package com.github.accname.libfizzbuzz.FactoryClasses;

import com.github.accname.libfizzbuzz.Printers.IntPrinter;

public class NumberPrint implements IntPrinter {
    final int integerToPrint;
    /*
     * @param num int
     */
    public NumberPrint(int num) {
        integerToPrint = num;
    }

    @Override
    public void printInteger() {
        System.out.print(integerToPrint);
    }
}

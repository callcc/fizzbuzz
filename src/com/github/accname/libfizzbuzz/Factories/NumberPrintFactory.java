package com.github.accname.libfizzbuzz.Factories;

import com.github.accname.libfizzbuzz.FactoryClasses.NumberPrint;

public class NumberPrintFactory {
    /*
     * @param toPrint int
     */
    public static void printNum(int toPrint) {
        NumberPrint num = new NumberPrint(toPrint);
        num.printInteger();
    }
}

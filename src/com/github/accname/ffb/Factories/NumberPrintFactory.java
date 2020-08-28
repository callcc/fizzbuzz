package com.github.accname.ffb.Factories;

import com.github.accname.ffb.FactoryClasses.NumberPrint;

public class NumberPrintFactory {
    public static void printNum(int toPrint) {
        NumberPrint num = new NumberPrint(toPrint);
        num.printInteger();
    }
}

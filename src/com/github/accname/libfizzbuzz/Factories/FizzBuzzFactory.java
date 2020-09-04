package com.github.accname.libfizzbuzz.Factories;

import com.github.accname.libfizzbuzz.FactoryClasses.FizzPrint;
import com.github.accname.libfizzbuzz.FactoryClasses.BuzzPrint;
import com.github.accname.libfizzbuzz.Printers.StrPrinter;

public class FizzBuzzFactory {
    /*
     * @return StrPrinter
     * @param fizzOrBuzz String
     */
    public StrPrinter getPrint(String fizzOrBuzz) {
        if(fizzOrBuzz == null) {
            return null;
        }
        if(fizzOrBuzz.equalsIgnoreCase("fizz")) {
            return new FizzPrint();
        } else if(fizzOrBuzz.equalsIgnoreCase("buzz")) {
            return new BuzzPrint();
        } else if(fizzOrBuzz.equalsIgnoreCase("done")) {
            System.out.println("");
        }
        return null;
    }
}

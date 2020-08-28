package com.github.accname.ffb.Factories;

import com.github.accname.ffb.FactoryClasses.FizzPrint;
import com.github.accname.ffb.FactoryClasses.BuzzPrint;
import com.github.accname.ffb.Printers.StrPrinter;

public class FizzBuzzFactory {
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

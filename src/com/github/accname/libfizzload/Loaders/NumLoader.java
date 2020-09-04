package com.github.accname.libfizzload.Loaders;

import com.github.accname.libfizzbuzz.Factories.FizzBuzzFactory;
import com.github.accname.libfizzbuzz.Factories.NumberPrintFactory;
import com.github.accname.libfizzload.Loaders.Loader;
import com.github.accname.libfizzload.Strategies.impl.*;

public class NumLoader implements Loader {
    FizzBuzzFactory fizz = new FizzBuzzFactory();
    public NumLoader() {
        load();
    }
    @Override
    public void load() {
        for(int i = 1; i <= 100; i++) {
            if(new FizzStrategy().isDivisible(i)) {
                fizz.getPrint("fizz").print();
            } else if(new BuzzStrategy().isDivisible(i)) {
                fizz.getPrint("buzz").print();
            } else {
                (new NumberPrintFactory()).printNum(i);
            }
            fizz.getPrint("done");
        }
    }
}

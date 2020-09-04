package com.github.accname.libfizzload.Loaders;

import com.github.accname.libfizzbuzz.Factories.NumberPrintFactory;
import com.github.accname.libfizzload.Loaders.Loader;

public class NumLoader implements Loader {
    final NumberPrintFactory numprint = new NumberPrintFactory();
    public NumLoader() {
        super();
        load();
    }
    @Override
    public void load() {
        for(int i = 1; i <= 100; i++) {

        }
        NumberPrintFactory.printNum(1);
    }
}

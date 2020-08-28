package com.github.accname;

import com.github.accname.ffb.Factories.FizzBuzzFactory;
import com.github.accname.ffb.Factories.NumberPrintFactory;
import com.github.accname.ffb.Factories.StrategyActivator;

public class Main {
    public static void main(String[] args) {
        StrategyActivator activator = new StrategyActivator();
        activator.ActivateStrategy("SAS_FBFS", 100);
    }
}

package com.github.accname.ffb.Strategies;

import com.github.accname.ffb.Exceptions.BuzzOverflowException;
import com.github.accname.ffb.Exceptions.FizzOverflowException;
import com.github.accname.ffb.Factories.FizzBuzzFactory;
import com.github.accname.ffb.Factories.NumberPrintFactory;

public class FizzBuzzFactoryStrategy implements Strategy {
    FizzBuzzFactory factory;
    NumberPrintFactory otherFactory;
    int input;
    public FizzBuzzFactoryStrategy(int toinput) {
        factory = new FizzBuzzFactory();
        otherFactory = new NumberPrintFactory();
        input = toinput;
    }

    @Override
    public void Action() {
        if (input % 3 == 0 && input % 5 == 0) {
            try {
                factory.getPrint("fizz").print();
            } catch (FizzOverflowException | BuzzOverflowException f) {
                return;
            }
            try {
                factory.getPrint("buzz").print();
            } catch (BuzzOverflowException | FizzOverflowException b) {
                return;
            }
        } else if (input % 3 == 0) {
            try {
                factory.getPrint("fizz").print();
            } catch (FizzOverflowException | BuzzOverflowException f) {
                return;
            }
        } else if (input % 5 == 0) {
            try {
                factory.getPrint("buzz").print();
            } catch (FizzOverflowException | BuzzOverflowException b) {
                return;
            }
        } else {
            otherFactory.printNum(input);
        }
        factory.getPrint("done");
    }
}
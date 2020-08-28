package com.github.accname.ffb.Strategies;

import com.github.accname.ffb.Factories.StrategyActivator;

public class StrategyActivatorStrategy_FizzBuzzFactoryStrategy implements Strategy {
    StrategyActivator activator;
    int input;
    public StrategyActivatorStrategy_FizzBuzzFactoryStrategy(int inputp) {
        activator = new StrategyActivator();
        input = inputp;
    }
    public void Action() {
        for(int i = 1; i <= input; i++) {
            activator.ActivateStrategy("fizzbuzzfactstrategy", i);
        }
    }
}

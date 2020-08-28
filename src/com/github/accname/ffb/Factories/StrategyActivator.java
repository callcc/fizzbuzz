package com.github.accname.ffb.Factories;

import com.github.accname.ffb.Strategies.Strategy;
import com.github.accname.ffb.Strategies.FizzBuzzFactoryStrategy;
import com.github.accname.ffb.Strategies.StrategyActivatorStrategy_FizzBuzzFactoryStrategy;

public class StrategyActivator {
    private Strategy CurrentStrategy;
    public Strategy ActivateStrategy(String strategy, int input) {
        if(strategy == null) {
            return null;
        }
        if(strategy.equalsIgnoreCase("fizzbuzzfactstrategy")) {
            CurrentStrategy = new FizzBuzzFactoryStrategy(input);
            CurrentStrategy.Action();
        } else if(strategy.equalsIgnoreCase("SAS_FBFS")) {
            CurrentStrategy = new StrategyActivatorStrategy_FizzBuzzFactoryStrategy(input);
            CurrentStrategy.Action();
        }
        return null;
    }
}

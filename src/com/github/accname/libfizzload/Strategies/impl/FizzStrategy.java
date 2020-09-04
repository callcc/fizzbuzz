package com.github.accname.libfizzload.Strategies.impl;

import com.github.accname.libfizzload.Strategies.Interfaces.isDivisible;

public class FizzStrategy implements isDivisible {
    /*
     * @return boolean
     * @param num int
     */
    @Override
    public boolean isDivisible(final int num) {
        return (num % 3 == 0);
    }
}

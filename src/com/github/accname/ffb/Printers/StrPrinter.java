package com.github.accname.ffb.Printers;

import com.github.accname.ffb.Exceptions.BuzzOverflowException;
import com.github.accname.ffb.Exceptions.FizzOverflowException;

public interface StrPrinter {
    public void print() throws FizzOverflowException, BuzzOverflowException;
}

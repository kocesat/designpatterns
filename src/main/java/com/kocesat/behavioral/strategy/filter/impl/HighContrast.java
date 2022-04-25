package com.kocesat.behavioral.strategy.filter.impl;

import com.kocesat.behavioral.strategy.filter.Filter;

public class HighContrast implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high contrast filter...");
    }
}

package com.kocesat.behavioral.strategy.filter.impl;

import com.kocesat.behavioral.strategy.filter.Filter;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying b&W filter...");
    }
}

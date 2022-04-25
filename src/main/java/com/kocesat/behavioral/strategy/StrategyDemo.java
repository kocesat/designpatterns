package com.kocesat.behavioral.strategy;

import com.kocesat.behavioral.strategy.compressor.impl.PNGCompressor;
import com.kocesat.behavioral.strategy.filter.impl.BlackAndWhiteFilter;
import com.kocesat.behavioral.strategy.filter.impl.HighContrast;

public class StrategyDemo {
    public static void main(String[] args) {
        var compressor = new PNGCompressor();
        var filter = new BlackAndWhiteFilter();
        var imageStorage = new ImageStore();
        imageStorage.store("a", compressor, filter);
        imageStorage.store("a", compressor, new HighContrast());
    }
}

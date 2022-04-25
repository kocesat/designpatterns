package com.kocesat.behavioral.strategy;

import com.kocesat.behavioral.strategy.compressor.Compressor;
import com.kocesat.behavioral.strategy.filter.Filter;

public class ImageStore {

    public void store(String fileName, Compressor compressor, Filter filter) {
        // JPEG, PNG, ..
        // B&W, High Contrast
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}

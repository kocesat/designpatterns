package com.kocesat.behavioral.strategy.compressor.impl;

import com.kocesat.behavioral.strategy.compressor.Compressor;

public class PNGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG...");
    }
}

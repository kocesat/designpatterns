package com.kocesat.creational.abstractfactory.leptop;

public class LeptopDemo {
    public static void main(String[] args) {
        var leptopBuilder = new LeptopBuilderFactory(Brand.APPLE, 250);
        Processor appleProcessor = leptopBuilder.getLeptopFactory().createProcessor();
        Storage appleStorage = leptopBuilder.getLeptopFactory().createStorage();
    }
}

package com.kocesat.creational.abstractfactory.leptop;

public class DellLeptop implements LeptopFactory {
    private int storageSize;

    public DellLeptop(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public Processor createProcessor() {
        return new DellProcessor();
    }

    @Override
    public Storage createStorage() {
        return new DellStorage();
    }
}

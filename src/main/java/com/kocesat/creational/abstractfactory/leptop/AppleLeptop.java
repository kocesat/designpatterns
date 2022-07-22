package com.kocesat.creational.abstractfactory.leptop;

public class AppleLeptop implements LeptopFactory {
    private int storageSize;

    public AppleLeptop(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public Processor createProcessor() {
        return new AppleProcessor();
    }

    @Override
    public Storage createStorage() {
        return new AppleStorage(storageSize);
    }
}

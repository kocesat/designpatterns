package com.kocesat.creational.abstractfactory.leptop;

public class LeptopBuilderFactory {
    private Brand brand;
    private int storageSize;

    public LeptopBuilderFactory(Brand brand, int storageSize) {
        this.brand = brand;
        this.storageSize = storageSize;
    }

    public LeptopFactory getLeptopFactory() {
        switch (brand) {
            case APPLE:
                return new AppleLeptop(storageSize);
            case DELL:
                return new DellLeptop(storageSize);
            default:
                throw new IllegalArgumentException("Please choose your brand");
        }
    }
}

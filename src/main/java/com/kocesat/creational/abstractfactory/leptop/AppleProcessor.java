package com.kocesat.creational.abstractfactory.leptop;

public class AppleProcessor implements Processor{
    private String storage;

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage.toString();
        System.out.println(storage + " is attached to the Apple leptop");
    }

    @Override
    public void printSpecs() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "AppleProcessor with Intel Processor and {" +
                "storage='" + storage + '\'' +
                '}';
    }
}

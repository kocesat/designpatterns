package com.kocesat.creational.abstractfactory.leptop;

public class AppleStorage implements Storage{
    private int size;

    public AppleStorage(int size) {
        this.size = size;
        System.out.println(size + " GB SSD will be used.");
    }

    @Override
    public void getType() {
        System.out.println("SSD");
    }
}

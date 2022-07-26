package com.kocesat.structural.decorator.mosh;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}

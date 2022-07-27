package com.kocesat.structural.bridge.mosh.device;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony: setChannel");
    }
}

package com.kocesat.structural.bridge.mosh.feature;

import com.kocesat.structural.bridge.mosh.device.Device;

public class RemoteControl {
    // This composition acts as a BRIDGE
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

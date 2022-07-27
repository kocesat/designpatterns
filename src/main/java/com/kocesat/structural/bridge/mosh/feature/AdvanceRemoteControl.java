package com.kocesat.structural.bridge.mosh.feature;

import com.kocesat.structural.bridge.mosh.device.Device;

public class AdvanceRemoteControl extends RemoteControl {
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }

}

package com.kocesat.structural.bridge.mosh;

import com.kocesat.structural.bridge.mosh.device.SamsungTV;
import com.kocesat.structural.bridge.mosh.device.SonyTV;
import com.kocesat.structural.bridge.mosh.feature.AdvanceRemoteControl;
import com.kocesat.structural.bridge.mosh.feature.RemoteControl;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        var advancedRemoteControl = new AdvanceRemoteControl(new SamsungTV());
        advancedRemoteControl.setChannel(2);
    }
}

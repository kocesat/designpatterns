package com.kocesat.structural.bridge.derekbanas.remote;

import com.kocesat.structural.bridge.derekbanas.device.EntertainmentDevice;

public class TVRemotePaused extends RemoteButton{
    public TVRemotePaused(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}

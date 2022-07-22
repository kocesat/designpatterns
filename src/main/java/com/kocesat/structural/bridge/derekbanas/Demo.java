package com.kocesat.structural.bridge.derekbanas;

import com.kocesat.structural.bridge.derekbanas.device.TVDevice;
import com.kocesat.structural.bridge.derekbanas.remote.RemoteButton;
import com.kocesat.structural.bridge.derekbanas.remote.TVRemoteMute;
import com.kocesat.structural.bridge.derekbanas.remote.TVRemotePaused;

public class Demo {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemotePaused(new TVDevice(1, 200));

        System.out.println("Test TV with Mte");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
    }
}

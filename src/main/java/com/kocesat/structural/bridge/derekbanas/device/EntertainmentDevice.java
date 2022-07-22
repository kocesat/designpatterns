package com.kocesat.structural.bridge.derekbanas.device;

public abstract class EntertainmentDevice {
    protected int state;
    protected int maxState;
    protected int volumeLevel = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback() {
        if (state > maxState || state < 0) {
            state = 0;
        }
        System.out.println("On " + state);
    }

    public void buttonSevenPressed() {
        volumeLevel++;
        depictVolumeLevel();
    }

    public void buttonEightPressed() {
        volumeLevel--;
        depictVolumeLevel();
    }

    private void depictVolumeLevel() {
        System.out.println("Volume at: " + volumeLevel);
    }

}

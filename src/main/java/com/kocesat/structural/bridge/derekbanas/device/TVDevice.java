package com.kocesat.structural.bridge.derekbanas.device;

public class TVDevice extends EntertainmentDevice{
    public TVDevice(int newState, int newMaxState) {
        state = newState;
        maxState = newMaxState;
    }

    @Override
    public void buttonFivePressed() {
        state--;
        showChannelChangeMessage("down");
        super.deviceFeedback();
    }

    @Override
    public void buttonSixPressed() {
        state++;
        showChannelChangeMessage("up");
        super.deviceFeedback();
    }

    private void showChannelChangeMessage(String upOrDown) {
        System.out.println("Channel " + upOrDown);
    }
}

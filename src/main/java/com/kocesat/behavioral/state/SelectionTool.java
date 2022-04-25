package com.kocesat.behavioral.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw a dash rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }
}

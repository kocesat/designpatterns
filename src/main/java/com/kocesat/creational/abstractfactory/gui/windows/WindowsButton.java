package com.kocesat.creational.abstractfactory.gui.windows;

import com.kocesat.creational.abstractfactory.gui.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows style button created");
    }
}

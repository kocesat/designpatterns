package com.kocesat.creational.abstractfactory.gui.mac;

import com.kocesat.creational.abstractfactory.gui.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOs style button created");
    }
}

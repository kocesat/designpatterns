package com.kocesat.creational.abstractfactory.gui.mac;

import com.kocesat.creational.abstractfactory.gui.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs style checkbox created");
    }
}

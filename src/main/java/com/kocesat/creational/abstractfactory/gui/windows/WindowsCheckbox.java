package com.kocesat.creational.abstractfactory.gui.windows;

import com.kocesat.creational.abstractfactory.gui.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows style checkbox created");
    }
}

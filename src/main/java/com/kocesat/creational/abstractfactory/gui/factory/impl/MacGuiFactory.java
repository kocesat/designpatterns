package com.kocesat.creational.abstractfactory.gui.factory.impl;

import com.kocesat.creational.abstractfactory.gui.Button;
import com.kocesat.creational.abstractfactory.gui.Checkbox;
import com.kocesat.creational.abstractfactory.gui.factory.GuiFactory;
import com.kocesat.creational.abstractfactory.gui.mac.MacButton;
import com.kocesat.creational.abstractfactory.gui.mac.MacCheckbox;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

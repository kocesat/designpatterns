package com.kocesat.creational.abstractfactory.gui.factory.impl;

import com.kocesat.creational.abstractfactory.gui.Button;
import com.kocesat.creational.abstractfactory.gui.Checkbox;
import com.kocesat.creational.abstractfactory.gui.factory.GuiFactory;
import com.kocesat.creational.abstractfactory.gui.windows.WindowsButton;
import com.kocesat.creational.abstractfactory.gui.windows.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package com.kocesat.creational.abstractfactory.gui;

import com.kocesat.creational.abstractfactory.gui.factory.GuiFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

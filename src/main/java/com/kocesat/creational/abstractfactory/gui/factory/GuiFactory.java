package com.kocesat.creational.abstractfactory.gui.factory;

import com.kocesat.creational.abstractfactory.gui.Button;
import com.kocesat.creational.abstractfactory.gui.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}

package com.kocesat.creational.abstractfactory.gui;

import com.kocesat.creational.abstractfactory.gui.factory.impl.MacGuiFactory;
import com.kocesat.creational.abstractfactory.gui.factory.impl.WindowsGuiFactory;

public class Main {
    public static void main(String[] args) {
        Application app = configureApp();
        app.paint();
    }

    public static Application configureApp() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            return new Application(new MacGuiFactory());
        } else {
            return new Application(new WindowsGuiFactory());
        }
    }
}

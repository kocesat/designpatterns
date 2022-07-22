package com.kocesat.creational.abstractfactory.log.model.concrete;

import com.kocesat.creational.abstractfactory.log.model.Logger;

public class InfoFileLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println("Write to file in blue color: " + message);
    }
}

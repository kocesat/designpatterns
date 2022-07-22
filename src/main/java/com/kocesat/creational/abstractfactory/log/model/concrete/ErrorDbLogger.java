package com.kocesat.creational.abstractfactory.log.model.concrete;

import com.kocesat.creational.abstractfactory.log.model.Logger;

public class ErrorDbLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Write to db in red color: " + message);
    }
}

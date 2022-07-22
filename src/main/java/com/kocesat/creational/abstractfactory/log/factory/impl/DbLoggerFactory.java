package com.kocesat.creational.abstractfactory.log.factory.impl;

import com.kocesat.creational.abstractfactory.log.LogLevel;
import com.kocesat.creational.abstractfactory.log.factory.LoggerFactory;
import com.kocesat.creational.abstractfactory.log.model.Logger;
import com.kocesat.creational.abstractfactory.log.model.concrete.ErrorDbLogger;
import com.kocesat.creational.abstractfactory.log.model.concrete.InfoDbLogger;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger(LogLevel logLevel) {
        switch (logLevel) {
            case INFO:
                return new InfoDbLogger();
            case ERROR:
                return new ErrorDbLogger();
            default:
                throw new IllegalArgumentException();
        }
    }
}

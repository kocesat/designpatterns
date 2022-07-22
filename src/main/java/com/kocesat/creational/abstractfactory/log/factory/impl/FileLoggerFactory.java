package com.kocesat.creational.abstractfactory.log.factory.impl;

import com.kocesat.creational.abstractfactory.log.LogLevel;
import com.kocesat.creational.abstractfactory.log.factory.LoggerFactory;
import com.kocesat.creational.abstractfactory.log.model.Logger;
import com.kocesat.creational.abstractfactory.log.model.concrete.ErrorFileLogger;
import com.kocesat.creational.abstractfactory.log.model.concrete.InfoFileLogger;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger(LogLevel logLevel) {
        switch (logLevel) {
            case INFO:
                return new InfoFileLogger();
            case ERROR:
                return new ErrorFileLogger();
            default:
                throw new IllegalArgumentException();
        }

    }
}

package com.kocesat.creational.abstractfactory.log.factory;

import com.kocesat.creational.abstractfactory.log.LogLevel;
import com.kocesat.creational.abstractfactory.log.LogType;
import com.kocesat.creational.abstractfactory.log.factory.impl.DbLoggerFactory;
import com.kocesat.creational.abstractfactory.log.factory.impl.FileLoggerFactory;
import com.kocesat.creational.abstractfactory.log.model.Logger;

public abstract class LoggerFactory {

    public static LoggerFactory newInstance(LogType logType) {
        switch (logType) {
            case DB:
                return new DbLoggerFactory();
            case FILE:
                return new FileLoggerFactory();
            default:
                return null;
        }
    }

    public abstract Logger getLogger(LogLevel logLevel);

}

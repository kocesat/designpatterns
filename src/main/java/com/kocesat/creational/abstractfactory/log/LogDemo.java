package com.kocesat.creational.abstractfactory.log;

import com.kocesat.creational.abstractfactory.log.factory.LoggerFactory;
import com.kocesat.creational.abstractfactory.log.model.Logger;

public class LogDemo {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = LoggerFactory.newInstance(LogType.FILE);
        Logger logger = loggerFactory.getLogger(LogLevel.INFO);
        logger.log("This is info file logger");

        LoggerFactory loggerDbFactory = LoggerFactory.newInstance(LogType.DB);
        Logger errorLogger = loggerDbFactory.getLogger(LogLevel.ERROR);
        errorLogger.log("This is error db logger");
    }
}

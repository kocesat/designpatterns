package com.kocesat.creational.abstractfactory.leptop;

public interface LeptopFactory {
    Processor createProcessor();
    Storage createStorage();
}

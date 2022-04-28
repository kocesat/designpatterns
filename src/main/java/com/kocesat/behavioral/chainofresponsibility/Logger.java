package com.kocesat.behavioral.chainofresponsibility;

public class Logger extends WebRequestHandler {
    public Logger(WebRequestHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logger");
        return false;
    }
}

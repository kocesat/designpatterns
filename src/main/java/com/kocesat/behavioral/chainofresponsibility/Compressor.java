package com.kocesat.behavioral.chainofresponsibility;

public class Compressor extends WebRequestHandler {
    public Compressor(WebRequestHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressor");
        return false;
    }
}

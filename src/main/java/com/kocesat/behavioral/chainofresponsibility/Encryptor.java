package com.kocesat.behavioral.chainofresponsibility;

public class Encryptor extends WebRequestHandler {
    public Encryptor(WebRequestHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryptor");
        return false;
    }
}

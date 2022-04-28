package com.kocesat.behavioral.chainofresponsibility;

public class Authenticator extends WebRequestHandler {
    public Authenticator(WebRequestHandler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin")
                && request.getPassword().equals("1234"));
        System.out.println("Authenticator");
         return !isValid;
    }
}

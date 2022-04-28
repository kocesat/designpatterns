package com.kocesat.behavioral.chainofresponsibility;

public class WebServer {
    private WebRequestHandler firstWebRequestHandler;

    public WebServer(WebRequestHandler firstHandler) {
        this.firstWebRequestHandler = firstHandler;
    }

    public void handle(HttpRequest request) {
        firstWebRequestHandler.handle(request);
    }
}

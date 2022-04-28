package com.kocesat.behavioral.chainofresponsibility;

public abstract class WebRequestHandler {
    private WebRequestHandler next;

    public WebRequestHandler(WebRequestHandler next) {
        this.next = next;
    }


    /**
     * If doHandle is true, execution is stopped!
     * Here, true means there is a problem, I'll handle it and throw an error
     * false means there is no problem, the request can continue its journey
     * to the next handler.
     * @param request
     */
    public void handle(HttpRequest request) {
        if (doHandle(request))
            return;
        if (next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}

package com.kocesat.behavioral.chainofresponsibility;

public class Program {
    public static void main(String[] args) {
        // authentication -> logger -> compressor -> encryptor
        var logger = new Logger(null);
        var encryptor = new Encryptor(logger);
        var compressor = new Compressor(encryptor);
        var authenticator = new Authenticator(compressor);
        var server = new WebServer(authenticator);
        server.handle(
                new HttpRequest("admin", "1234")
        );
    }
}

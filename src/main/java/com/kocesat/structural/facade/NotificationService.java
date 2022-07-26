package com.kocesat.structural.facade;

/**
 * Facade layer
 */
public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}

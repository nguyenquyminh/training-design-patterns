package com.example.factory.model;

public class NotificationMessage extends Notification {
    public NotificationMessage(String message) {
        super(message);
    }

    public void send() {
        System.out.println("Message: " + message);
    }
}

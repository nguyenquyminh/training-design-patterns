package com.example.factory.model;

public class NotificationCall extends Notification {
    public NotificationCall(String message) {
        super(message);
    }

    public void send() {
        System.out.println("Call: " + message);
    }
}

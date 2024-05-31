package com.example.factory.model;

public class NotificationAlert extends Notification {
    public NotificationAlert(String message) {
        super(message);
    }

    public void send() {
        System.out.println("Alert: " + message);
    }
}

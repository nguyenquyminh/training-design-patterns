package com.example.factory.service;

import com.example.factory.model.Notification;
import com.example.factory.model.NotificationAlert;
import com.example.factory.model.NotificationCall;
import com.example.factory.model.NotificationMessage;

public class NotificationService {
    public void notifyUser(String notificationType, String message) {
        Notification notification;
        if (notificationType.equals("ALERT")) {
            notification = new NotificationAlert(message);
        } else if (notificationType.equals("REMINDER")) {
            notification = new NotificationCall(message);
        } else if (notificationType.equals("MESSAGE")) {
            notification = new NotificationMessage(message);
        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }
        notification.send();
    }
}

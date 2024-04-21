package com.sanket.lld2_scaler.DesignPatterns.Factory.Notification;

public class NotificationFactory {
    public static Notification getNotification(NotificationType type, String recipient, String message, String sender) {
        switch (type) {
            case SMS:
                return new SmsNotification(recipient, message);
            case PUSH:
                return new PushNotification(recipient, message);
            case EMAIL:
                return new EmailNotification(recipient, message, sender);
        }

        return null;
    }
}

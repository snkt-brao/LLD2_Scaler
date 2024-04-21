package com.sanket.lld2_scaler.DesignPatterns.Factory.Notification;

public class PushNotification extends Notification {
    private String recipient;
    private String message;

    public PushNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
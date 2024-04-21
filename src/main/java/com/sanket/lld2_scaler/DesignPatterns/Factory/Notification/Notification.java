package com.sanket.lld2_scaler.DesignPatterns.Factory.Notification;

public abstract class Notification {
    public abstract NotificationType notificationType();

    public abstract String getRecipient();

    public abstract String getMessage();

    public abstract void sendNotification();
}

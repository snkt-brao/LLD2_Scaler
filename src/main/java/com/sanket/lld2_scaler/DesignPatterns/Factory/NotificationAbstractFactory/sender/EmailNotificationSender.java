package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.Notification;

public class EmailNotificationSender extends NotificationSender{
    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}

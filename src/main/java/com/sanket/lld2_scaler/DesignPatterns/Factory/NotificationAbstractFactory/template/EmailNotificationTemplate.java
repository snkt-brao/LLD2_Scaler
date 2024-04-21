package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate {
    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}

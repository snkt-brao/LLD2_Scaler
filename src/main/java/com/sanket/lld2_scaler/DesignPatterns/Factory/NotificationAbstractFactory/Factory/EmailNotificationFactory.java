package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.EmailNotification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.Notification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender.EmailNotificationSender;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender.NotificationSender;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.EmailNotificationTemplate;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification getNotificationInstance(String recipient, NotificationTemplate template, String sender) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationSender getNotificationSenderInstance(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate getNotificationTemplateInstance(String message) {
        return new EmailNotificationTemplate(message);
    }
}

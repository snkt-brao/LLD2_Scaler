package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.Notification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.PushNotification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender.NotificationSender;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender.PushNotificationSender;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.NotificationTemplate;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification getNotificationInstance(String recipient, NotificationTemplate template, String sender) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationSender getNotificationSenderInstance(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate getNotificationTemplateInstance(String message) {
        return new PushNotificationTemplate(message);
    }
}

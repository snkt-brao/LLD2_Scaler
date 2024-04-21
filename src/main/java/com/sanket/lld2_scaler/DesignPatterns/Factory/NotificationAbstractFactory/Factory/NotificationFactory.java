package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.Notification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.sender.NotificationSender;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract Notification getNotificationInstance(String recipient, NotificationTemplate template,String sender);

    public abstract NotificationSender getNotificationSenderInstance(Notification notification);

    public abstract NotificationTemplate getNotificationTemplateInstance(String message);

}

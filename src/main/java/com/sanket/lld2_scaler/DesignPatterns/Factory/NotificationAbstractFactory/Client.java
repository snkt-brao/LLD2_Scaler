package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory.ConcreteNotificationFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory.NotificationFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.notification.Notification;
import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.template.NotificationTemplate;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        NotificationFactory notificationFactory = ConcreteNotificationFactory.getNotificationFactory(NotificationType.EMAIL);

        NotificationTemplate template = notificationFactory.getNotificationTemplateInstance("How are you..!");

        Notification notification = notificationFactory.getNotificationInstance("sanket@gmail.com", template, "vixky@hotmail.com");
        notification.sendNotification();
    }
}

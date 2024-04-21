package com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.NotificationAbstractFactory.NotificationType;

import java.io.IOException;

public class ConcreteNotificationFactory {
    public static NotificationFactory getNotificationFactory(NotificationType type) throws IOException {
        switch (type) {
            case EMAIL -> {
                return new EmailNotificationFactory();
            }
            case PUSH -> {
                return new PushNotificationFactory();
            }
            default -> {
                throw new IOException("Invalid notification type");
            }
        }
    }
}

package com.sanket.lld2_scaler.DesignPatterns.Builder.Message;

public class Client {
    public static void main(String[] args) {
        MessageBuilder messageBuilder = MessageBuilder.getBuilder().build();
    }
}

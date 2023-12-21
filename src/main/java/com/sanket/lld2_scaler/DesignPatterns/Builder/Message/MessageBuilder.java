package com.sanket.lld2_scaler.DesignPatterns.Builder.Message;

public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(Builder builder) {
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.isDelivered = builder.isDelivered();
        this.timestamp = builder.getTimestamp();
        this.messageType = builder.getMessageType();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        private MessageType messageType;
        private String content;

        private String sender;

        private String recipient;
        private boolean isDelivered;

        private long timestamp;

        public MessageBuilder build() {
            return new MessageBuilder(this);
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public void setDelivered(boolean delivered) {
            isDelivered = delivered;
        }

        public MessageType getMessageType() {
            return messageType;
        }

        public void setMessageType(MessageType messageType) {
            this.messageType = messageType;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
    }


}

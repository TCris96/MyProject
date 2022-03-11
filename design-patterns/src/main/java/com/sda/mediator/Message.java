package com.sda.mediator;

import java.time.LocalDateTime;

public class Message {
    private String messageText;
    private LocalDateTime timeSent;
    public Message(String text){
        this.messageText = text;
        timeSent = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}

package com.javasolutions.mediator.simple;

public class TextMessage implements Message {
    private String textMessage;

    public  TextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String textMessage() {
        return textMessage;
    }
}

package com.javasolutions.mediator.simple;

public interface User {
    void send(Message message);
    void receive(Message message);
}

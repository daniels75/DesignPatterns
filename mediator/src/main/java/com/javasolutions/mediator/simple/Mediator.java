package com.javasolutions.mediator.simple;

public interface Mediator {

    void send(User fromUser, Message message);
    void addUser(User user);
    void removeUser(User user);
}

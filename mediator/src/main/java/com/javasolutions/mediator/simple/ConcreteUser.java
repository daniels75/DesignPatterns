package com.javasolutions.mediator.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteUser implements User {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteUser.class);
    private UserType userType;
    private Mediator mediator;

    public ConcreteUser(UserType userType, Mediator mediator){
        this.userType = userType;
        this.mediator = mediator;
    }

    @Override
    public void send(Message message) {
        LOGGER.info("{} sent a message: {}", userType, message.textMessage());
        mediator.send(this, message);
    }

    @Override
    public void receive(Message message) {
        LOGGER.info("    --> Message received by {}: {}", this, message.textMessage());
    }

    public String toString(){
        return userType.description();
    }
}

package com.javasolutions.mediator.simple;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class ChatMediator implements Mediator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChatMediator.class);
    private Collection<User> users = Sets.newLinkedHashSet();

    @Override
    public void send(User fromUser, Message message) {
        LOGGER.info("--> Message from {}: {}", fromUser, message.textMessage());
        for (User user : users) {
            if (user.equals(fromUser)) {
                continue;
            }
            user.receive(message);
        }
    }

    @Override
    public void addUser(User user) {
        LOGGER.info("User {} has been added.", user);
        users.add(user);

    }

    @Override
    public void removeUser(User user) {
        LOGGER.info("User {} has been removed.", user);
        users.remove(user);
    }
}

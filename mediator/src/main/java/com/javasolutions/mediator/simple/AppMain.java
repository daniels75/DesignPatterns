package com.javasolutions.mediator.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppMain.class);

    public static void main(String []args) {
        Mediator mediator = new ChatMediator();

        User admin = new ConcreteUser(UserType.ADMIN, mediator);
        User javaDev = new ConcreteUser(UserType.JAVA_DEVELOPER, mediator);
        User angularDev = new ConcreteUser(UserType.ANGULAR_DEVELOPER, mediator);
        mediator.addUser(admin);
        mediator.addUser(javaDev);
        mediator.addUser(angularDev);
        LOGGER.info("-------------------------------------------------------");

        Message adminMessage = new TextMessage("Linux will be updated.");
        admin.send(adminMessage);

        Message angularDevMessage = new TextMessage("UI will be updated.");
        angularDev.send(angularDevMessage);

    }
}

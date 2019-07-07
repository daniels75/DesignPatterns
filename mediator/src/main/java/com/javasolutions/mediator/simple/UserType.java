package com.javasolutions.mediator.simple;

public enum UserType {

    ADMIN("Admin"),
    DEVOPS("DevOps"),
    DB_ADMIN("Database admin"),
    JAVA_DEVELOPER("Java Developer"),
    ANGULAR_DEVELOPER("Angular Developer");

    final String description;

    UserType(String description) {
        this.description = description;
    }

    public String description() {
        return this.description;
    }
}

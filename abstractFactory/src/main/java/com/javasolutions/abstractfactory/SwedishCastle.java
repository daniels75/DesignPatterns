package com.javasolutions.abstractfactory;

public class SwedishCastle implements Castle {
    @Override
    public String getDescription() {
        return "Swedish castle";
    }
    public String toString() {
        return getDescription();
    }
}

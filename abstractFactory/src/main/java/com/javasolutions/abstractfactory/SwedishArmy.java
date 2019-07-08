package com.javasolutions.abstractfactory;

public class SwedishArmy implements Army {
    @Override
    public String getDescription() {
        return "Swedish army";
    }
    public String toString() {
        return getDescription();
    }
}

package com.javasolutions.abstractfactory;

public class FrenchArmy implements  Army {
    @Override
    public String getDescription() {
        return "French army";
    }

    public String toString() {
        return getDescription();
    }
}

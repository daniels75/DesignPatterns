package com.javasolutions.abstractfactory;

public class PolishArmy implements Army {

    @Override
    public String getDescription() {
        return "Polish army";
    }

    public String toString() {
        return getDescription();
    }
}

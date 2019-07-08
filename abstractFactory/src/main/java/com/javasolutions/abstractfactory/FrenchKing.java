package com.javasolutions.abstractfactory;

public class FrenchKing implements King {
    @Override
    public String getDescription() {
        return "Louis XIV";
    }
    public String toString() {
        return getDescription();
    }
}

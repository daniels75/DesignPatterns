package com.javasolutions.abstractfactory;

public class PolishCastle implements Castle {
    @Override
    public String getDescription() {
        return "Polish castle";
    }
    public String toString() {
        return getDescription();
    }
}

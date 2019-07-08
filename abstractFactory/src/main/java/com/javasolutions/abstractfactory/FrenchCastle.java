package com.javasolutions.abstractfactory;

public class FrenchCastle implements  Castle{
    @Override
    public String getDescription() {
        return "French castle";
    }
    public String toString() {
        return getDescription();
    }
}

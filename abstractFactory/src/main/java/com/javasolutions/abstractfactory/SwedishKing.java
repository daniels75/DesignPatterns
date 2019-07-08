package com.javasolutions.abstractfactory;

public class SwedishKing implements King {
    @Override
    public String getDescription() {
        return "Gustav II Adolf";
    }
    public String toString() {
        return getDescription();
    }
}

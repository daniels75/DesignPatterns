package com.javasolutions.abstractfactory;

public class PolishKing implements King{
    @Override
    public String getDescription() {
        return "Jan III Sobieski";
    }
    public String toString() {
        return getDescription();
    }
}

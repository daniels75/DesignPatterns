package com.javasolutions.abstractfactory;

public class SwedishKindgomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new SwedishCastle();
    }

    @Override
    public King createKing() {
        return new SwedishKing();
    }

    @Override
    public Army createArmy() {
        return new SwedishArmy();
    }
}

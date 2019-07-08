package com.javasolutions.abstractfactory;

public class FrenchKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return null;
    }

    @Override
    public King createKing() {
        return null;
    }

    @Override
    public Army createArmy() {
        return null;
    }
}

package com.javasolutions.abstractfactory;

public class FrenchKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new FrenchCastle();
    }

    @Override
    public King createKing() {
        return new FrenchKing();
    }

    @Override
    public Army createArmy() {
        return new FrenchArmy();
    }
}

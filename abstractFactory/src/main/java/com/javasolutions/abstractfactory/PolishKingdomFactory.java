package com.javasolutions.abstractfactory;

public class PolishKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new PolishCastle();
    }

    @Override
    public King createKing() {
        return new PolishKing();
    }

    @Override
    public Army createArmy() {
        return new PolishArmy();
    }
}

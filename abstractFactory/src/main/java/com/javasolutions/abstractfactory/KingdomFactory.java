package com.javasolutions.abstractfactory;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}

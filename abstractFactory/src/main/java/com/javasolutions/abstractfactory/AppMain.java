package com.javasolutions.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppMain.class);

    private Castle castle;
    private King king;
    private Army army;

    public void createKingdom(KingdomFactory kingdomFactory) {
        castle = kingdomFactory.createCastle();
        king = kingdomFactory.createKing();
        army = kingdomFactory.createArmy();
    }

    public Castle getCastle() {
        return castle;
    }

    public King getKing() {
        return king;
    }

    public Army getArmy() {
        return army;
    }

    public static void main(String []args) {
        final AppMain appMain = new AppMain();

        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.POLAND));
        LOGGER.info("{} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());

        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.SWEDEN));
        LOGGER.info("{} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());

        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.FRANCE));
        LOGGER.info("{} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());



    }
}

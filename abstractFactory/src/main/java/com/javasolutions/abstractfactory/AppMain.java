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


        LOGGER.info("----------------- Polish Kingdom will be created -----------------");
        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.POLISH));
        LOGGER.info("    {} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());

        LOGGER.info("----------------- Swedish Kingdom will be created -----------------");
        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.SWEDISH));
        LOGGER.info("    {} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());

        LOGGER.info("----------------- French Kingdom will be created -----------------");
        appMain.createKingdom(KingdomFactoryMaker.create(KingdomType.FRENCH));
        LOGGER.info("    {} with King {} and {}", appMain.getCastle(), appMain.getKing(), appMain.getArmy());



    }
}

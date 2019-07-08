package com.javasolutions.abstractfactory;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class KingdomFactoryMaker {

    private static final Map<KingdomType, KingdomFactory> kingdoms = ImmutableMap.<KingdomType, KingdomFactory>builder()
            .put(KingdomType.POLISH, new PolishKingdomFactory())
            .put(KingdomType.SWEDISH, new SwedishKindgomFactory())
            .put(KingdomType.FRENCH, new FrenchKingdomFactory())
            .build();

    public static KingdomFactory create(KingdomType kingdomType) {
        return kingdoms.get(kingdomType);
    }
}

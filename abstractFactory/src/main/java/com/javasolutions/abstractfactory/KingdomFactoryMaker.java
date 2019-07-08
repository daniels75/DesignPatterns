package com.javasolutions.abstractfactory;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Map;

public class KingdomFactoryMaker {

    private static final Map<KingdomType, KingdomFactory> kingdoms = ImmutableMap.<KingdomType, KingdomFactory>builder()
            .put(KingdomType.POLAND, new PolishKingdomFactory())
            .put(KingdomType.SWEDEN, new SwedishKindgomFactory())
            .put(KingdomType.FRANCE, new FrenchKingdomFactory())
            .build();

    public static KingdomFactory createKindomFactory(KingdomType kingdomType) {
        return kingdoms.get(kingdomType);
    }
}

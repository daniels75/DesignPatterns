package com.javasolutions.abstractfactory;

import com.google.common.collect.Maps;

import java.util.Map;

public class KingdomFactoryMaker {
    private static final Map<KingdomType, KingdomFactory> kingdoms = Maps.newHashMap();
}

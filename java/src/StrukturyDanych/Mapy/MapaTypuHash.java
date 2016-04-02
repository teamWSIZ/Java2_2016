package StrukturyDanych.Mapy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pm on 4/2/16.
 */
public class MapaTypuHash {
    public static void main(String[] args) {
        Map<String, Double> polozeniaAut = new HashMap<>();
        polozeniaAut.put("APX1321", 3.14);
        polozeniaAut.put("BBX3333", 4.28);

        System.out.println(polozeniaAut.containsKey("APX1322"));

    }
}

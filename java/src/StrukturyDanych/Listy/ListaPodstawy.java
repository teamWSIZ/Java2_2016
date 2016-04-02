package StrukturyDanych.Listy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pm on 4/2/16.
 */
public class ListaPodstawy {
    public static void main(String[] args) {
        List<String> w = new ArrayList<>();
        w.add("Beta");
        w.add("Abra kadabra");
        w.add("Abra kadabra");
        w.add("Beta");
        w.add("Beta");
        w.add("Gamma");
        System.out.println(w);

        System.out.println(w.get(0));
        System.out.println(w.size());

        w.remove("Beta");

        for(String s : w) {
            System.out.println("**" + s + "**");
        }
        //zadanie: wypisac na ktorych pozycjach listy jest słowo "Beta"
        String szukany = "Beta";
//        for (int i = 0; i < w.size(); i++) {
//            // jesli w.get(i) jest taki sam jak `szukany` to wypisac `i`
//        }

        //Zadanie2: stworzyc liste liczb całkowitych podzielnych przez 7 mniejszych niż 100


        //Zaawansowany syntax:
//        w.stream()
//                .filter(i->i.equals(szukany))
//                .map(i->i+i)
//                .forEach(i-> System.out.println(i));

    }
}

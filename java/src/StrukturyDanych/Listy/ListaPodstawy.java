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

//        Proste wczytywanie danych z klawiatury:
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i < 100; i++) {
//            String wpisany = s.next();
//            if (wpisany.equals("x")) break;
//            w.add(wpisany);
//        }
        System.out.println(w);

        // Odczyt elementów z listy
        System.out.println(w.get(2));
        System.out.println("Liczba elementów w liście: "  + w.size());

        //Zadanie3: stworzyć listę liczb typu 0,0.01, 0.02, 0.03 ... 0.99, 1
//        List<Double> ulamki = new ArrayList<>();
//        for (int i = 1; i <= 100; i++) {
//            ulamki.add(0.01 * i);
//        }
//        System.out.println(ulamki);


//
//        w.remove("Beta");
        System.out.println(w);


        for (int i = 0; i < 10; i++) {
            //zwykła
        }

        for(String s : w) {
            System.out.println("**" + s + "**");
        }

        //Zadanie1: wypisac na ktorych pozycjach listy jest słowo "Beta"
        String szukany = "Beta";
////        for (int i = 0; i < w.size(); i++) {
////            // jesli w.get(i) jest taki sam jak `szukany` to wypisac `i`
////        }

        //Zadnie 4: policzyć ile razy w liście napisów pojawia sie napis "Beta"
        szukany = "Beta";
        // ustalić int x = 0;
        /// przejść po elementach listy
        // jeśli element.equals(szukany) --> zwiększyć x o jeden
        // za pętlą --> wypisać `x`
        int x = 0;
        for(String s : w) {
            if (s.equals(szukany)) x++;
        }
        System.out.println(x);

        //Zadanie 4: ile razy zdarza sie w liście, że dwa sąsiednie elementy są równe,
        //  {1,2,3,4} --> 0
        // {1,1,2,3,4} --> 1
        // {2,2,3,3,4} -->2
        // {2,2,2,3,4} -->2

        String poprzedni = "..!!....";
        //petla
        // if `s` .equals poprzedni --> x++
        // poprzedni = s
        int y = 0;
        for(String s : w) {
            if (s.equals(poprzedni)) {
                y++;
            }
            poprzedni = s;
        }
        System.out.println(y);


//
//        //Zadanie2: stworzyc liste liczb całkowitych podzielnych przez 7 mniejszych niż 100
//
//
//        //Zaawansowany syntax:
////        w.stream()
////                .filter(i->i.equals(szukany))
////                .map(i->i+i)
////                .forEach(i-> System.out.println(i));

    }
}

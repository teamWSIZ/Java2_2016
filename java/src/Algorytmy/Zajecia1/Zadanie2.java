package Algorytmy.Zajecia1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pm on 4/2/16.
 */
public class Zadanie2 {
    public static void main(String[] args) {
//        dane są prezenty … ponumerowane od 1..1000; ich ceny wynosza dopowiednio 1..1000;
// dostajemy też listę prezentów "mało atrakcyjnych", typu {2,3,8}; oraz sumę pieniędzy "suma";
// proszę podać listę prezentów kupowanych od najtańszych "w górę", nie należących do "mało atrakcyjnych",
// które można kupić tak, by nie przekroczyć kosztu "suma";
//        przykład: mało atrakcyjne {2,3,8}, suma=5, wynik {1,4}; jeśli suma=33, to wynik byłby {1,4,5,6,7,9}

        int suma = 20;
        List<Integer> nieAtrakcyjne = new ArrayList<>();
        nieAtrakcyjne.add(3);
        nieAtrakcyjne.add(6);

        List<Integer> kupione = new ArrayList<>();
        int doZaplacenia = 0;
        for (int i = 1; i < 2000; i++) {
            if (doZaplacenia + i > suma) break;     //konczy zabawe w kupowanie
            if (nieAtrakcyjne.contains(i)) continue;        //nie wykonuje kupna ponizej
            doZaplacenia += i;
            kupione.add(i);
        }

        System.out.println("Kupione: " + kupione);
        System.out.println("Zapłacono: " + doZaplacenia);






    }
}

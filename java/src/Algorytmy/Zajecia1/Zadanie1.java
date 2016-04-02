package Algorytmy.Zajecia1;

/**
 * Created by pm on 4/2/16.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        /**
         * Mamy zegar z 12 godzinami (1,2,3...,12);
         * Obecnie wskazuje godzinę "teraz"
         * Proszę wyliczyć jaką godzinę będzie wskazywał po dodaniu "x" godzin (uwaga: x może być ujemne)
         */
        int teraz = 3;
        int x = -3;
        if (x<0) x += 12*30;

        int nowa = teraz + x;       //17
//        if (nowa>12) nowa -= 12;
        for (int i = 0; i < 1000; i++) {
            if (nowa>12) nowa-=12;
        }
        System.out.println(nowa);




    }
}

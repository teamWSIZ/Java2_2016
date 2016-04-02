package ArchitekturaSystemow.Podatki;

import java.util.Scanner;

/**
 * Created by pm on 4/2/16.
 */
public class ProstyKalkulator {
    public static void main(String[] args) {
        //Zadanie: wpisujemy kwote zarobioną ~60000
        //z kwoty do 30k: płacimy 15%;
        //z kwoty do 60k: płacimy 30%
        //z reszty płacimy 90%;

        //wyliczyć kwotę i średnio procentowy podatek

        Scanner s = new Scanner(System.in);
        int zarobione = s.nextInt();
        int caleZarobione = zarobione;
        int calyPodatek = 0;

        int doOpodatkowania;

        //15%
        if (zarobione<=30000) doOpodatkowania = zarobione;
        else doOpodatkowania=30000;
        calyPodatek += 0.15 * doOpodatkowania;
        zarobione -= doOpodatkowania;

        //15%
        if (zarobione<=30000) doOpodatkowania = zarobione;
        else doOpodatkowania=30000;
        calyPodatek += 0.3 * doOpodatkowania;
        zarobione -= doOpodatkowania;

        calyPodatek += 0.90 * zarobione;

        System.out.println("Cały podatek: " + calyPodatek);
        System.out.println("Procentowo: " + (100. * calyPodatek/ caleZarobione));



    }
}

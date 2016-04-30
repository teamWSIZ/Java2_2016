package Algorytmy.Zajecia3;


import java.util.ArrayList;
import java.util.List;

interface DoAutocomplete {
    String getName();
}

class Client implements DoAutocomplete {
    String name;
    String pesel;

    public Client(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}

class Product implements DoAutocomplete {
    String name;
    Integer cena;

    public Product(String name, Integer cena) {
        this.name = name;
        this.cena = cena;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cena=" + cena +
                '}';
    }
}

class Matcher {
    public static List<DoAutocomplete> matchIt(List<DoAutocomplete> args, String zapyt) {
        //przesortowac liste `args` i wybrac pasujace do stringu `query`
        List<DoAutocomplete> result = new ArrayList<>();
        for(DoAutocomplete a : args) {
            if (a.getName().startsWith(zapyt)) {
                result.add(a);
            } else {
                String name = a.getName();
                if (!zapyt.toUpperCase().equals(zapyt)) continue;
                String tylkoDuzeZa = "";
                for (int i = 0; i < name.length(); i++) {
                    if (Character.isUpperCase(name.charAt(i))) tylkoDuzeZa += name.charAt(i);
                }
                if (tylkoDuzeZa.startsWith(zapyt)) result.add(a);
//                int at = 0;
//                for (int i = 0; i < zapyt.length(); i++) {
//                    char c = zapyt.charAt(i);
//                    int foundAt = name.indexOf(c, at);  //szukamy litery `c` od miejsca `at`
//                    if (foundAt<0) break;
//                    if (i==zapyt.length()-1) result.add(a);
//                    at = foundAt + 1;   //nastepnej litery szukamy od nastepnego znaku
//                }
            }
        }
        return result;
    }
    public static List<DoAutocomplete> sortIt(List<DoAutocomplete> args) {
        //po typie klasy, potem po nazwie alfabetycznie
        return args;
    }

}


public class A {
    public static void main(String[] args) {
        /**
         * Cel: "autocomplete"
         *
         * Sytuacja: różne obiekty mające pole "nazwa"; po wpisaniu kilku liter (query) znajdujemy pasujące
         * - zaczynające się od `query`
         * - kończące się na `query`
         * - typu qu...E...R..Y..
         */




        Client c = new Client("aaa","123");
        Client cc = new Client("PszoK","123");
        Product p = new Product("aab", 100);
        List<DoAutocomplete> doPrzeszukania = new ArrayList<>();

        doPrzeszukania.add(c);
        doPrzeszukania.add(cc);
        doPrzeszukania.add(p);
        System.out.println(Matcher.matchIt(doPrzeszukania,"PK"));

        //Zadanie: dodać match do głównych dużych liter, tzn:
        // jeśli damy ASK, to powinien dopasować do
        //      ArchitekturaSystemówKomputerowych
        //ale nie do ArchitekturaKomputerowa

//        System.out.println(Character.isUpperCase('A'));

//        String napis = "CCC";
        //sposob sprawdzenia czy napis jest tylko z duzych liter
//        System.out.println(napis.toUpperCase().equals(napis));


//        String costam = "aaaaaB......B......C.....A";
//        System.out.println(costam.indexOf('B', 6));

    }
}

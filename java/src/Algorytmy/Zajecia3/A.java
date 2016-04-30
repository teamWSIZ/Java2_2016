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
    public static List<DoAutocomplete> matchIt(List<DoAutocomplete> args, String query) {
        //przesortowac liste `args` i wybrac pasujace do stringu `query`
        List<DoAutocomplete> result = new ArrayList<>();
        for(DoAutocomplete a : args) {
            if (a.getName().startsWith(query)) result.add(a);
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
        Product p = new Product("aab", 100);
        List<DoAutocomplete> doPrzeszukania = new ArrayList<>();

        doPrzeszukania.add(c);
        doPrzeszukania.add(p);
        System.out.println(Matcher.matchIt(doPrzeszukania,"aa"));

    }
}

package Algorytmy.KilkaZadan1;


class City {
    double lon;
    double lat;
}

class CityUtils {

}


class NamedCity extends City {
    String cityName;
}


public class Proste {
    public static void main(String[] args) {

        //Zadanie "A" *:
        //Dana jest lista liczb całkowitych "li", oraz liczba "x"; sprawdzić ile razy "x" występuje w liście
        //Przykład: {1,2,4,4,2,1,2}, x=2 --> 3

        //Zadanie "B" *:
        //Dana jest tablica liczb całkowitych; wykorzystać Arrays.sort(...) by posortować tablicę, i
        //znaleźć różnicę między największą i najmniejszą liczbą tablicy
        //Przykład {1,2,4,4,2,1,2} --> {1,1,2,2,2,4,4}, "3"

        //Zadanie "C" *:
        //Dana jest klasa "City" opisująca pozycję miasta (powyżej); napisać konstruktor biorący dwie
        // liczby ułamkowe i tworzący instancje klasy City
        //Przykład City c = new City(1.2, 2.3)

        //Zadanie "D" **:
        //Dana jest klasa "City" (powyżej); napisać metodę "boolean near(City other)" zwracającą "true"
        //jeśli wartości "lon" obecnego miasta i "other", oraz "lat" obecnego i "other" nie różnią się więcej niż o 0.1
        //Przykład new City(1.2,2.3).near(new City(1.2,2.4)) --> true
        //Przykład new City(1.2,2.3).near(new City(1.3,2.4)) --> true
        //Przykład new City(1.2,2.3).near(new City(1.0,2.3)) --> false

        //Zadanie "E" *:
        //Stworzyć listę czterech różnych instancji klasy City

        //Zadanie "F" ***:
        //Napisać statyczną metodę "boolean CityUtils.allNear(List<City>)" sprawdzającą czy wszystkie miasta
        //argumentu są wzajemnie blisko siebie tzn mają lon i lat różnijące się nie więcej niż o 0.1
        //Przykład (obrazowy) allNear({ {0,0},{0.1,0},{0,0.1}}) --> true
        //Przykład (obrazowy) allNear({ {0,0.2},{0.1,0},{0,0.1}}) --> false

        //Zadanie "G" **:
        //Mając dane dwie tablice (równej długości) liczb double "lons, lats" stworzyć listę miast "City"
        //posiadających pola "lon", "lat" odpowiednio z tablic
        //Przykład lons=[0,0.1,0.2], lats=[0.1,0.1,-0.1] --> { {0,0.1}, {0.1,0.1}, {0.2,-0.1} }

        //Zadanie "H" **:
        //Stworzyć listę pięciu różnych instancji klasy NamedCity

        //Zadanie "I" *:
        //Napisać metodę NamedCity.toString zamieniającą NamedCity na w miarę czytelny napis (String)

        //Zadanie "J" **:
        //Stworzyć okno dialogowe pozwalające tworzyć instancje klasy NamedCity, i wypisujące do konsoli
        // wynik (np. przy pomocy odpowiedniej metody "toString"

        //Zadanie "K" ***:
        //Stworzyć GUI w którym będzie ComboBox, z którego będzie można wybrać jedną z pięciu instancji
        //klasy NamedCity (listę danych można wpisać w konstruktorze klasy GUI)

        //Zadanie "L" **:
        //Stworzyć projekt "maven", załączyć dependecję do Lombok w "pom.xml", stworzyć klasy
        //City i NamedCity (jak powyżej) z annotacją @Data i @AllArgsConstructor i pokazać
        //tworzenie instancji obu klas przy pomocy konstuktorów biorących za argument
        //napis (cityName) i obie pozycje

        //Zadanie "M" ***:
        //Posortować listę miast wg "lon", a dla równych wg. "lat"; wykorzystać
        //Collections.sort(...,new Comparator<City>(){....})
        //Przykład { {1,1},{2,1},{1,0} } --> { {1,0}, {1,1}, {2,1} }

        //Zadanie "N" ***:
        //Napisać metodę "City CityUtils.nearest(City target, List<City> others)" znajdującą miasto z "others" najbliższe
        //do "target" (zdefiniować "najbliższe" w wygodny sposób).

        //Zadanie "O" *:
        //Mając daną listę String-ów, sprawdzić czy jakiś element się powtarza
        //Przykład: { "aa", "bb", "ab"} -> false
        //Przykład: { "aa", "bb", "aa"} -> true

        //Zadanie "P" **:
        //Mając daną listę String-ów, sprawdzić czy jakiś element się powtarza przy ignorowaniu dużych/małych liter
        //Przykład: { "aa", "bb", "AB"} -> false
        //Przykład: { "aa", "bb", "Bb"} -> true

        //Wymagania:
        //na "5": ****
        //na "4.5": ***
        //na "4": **
        //na niższe: mniej gwiazdek
    }
}

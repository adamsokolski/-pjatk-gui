package cwiczenia.c04;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba haniek = new Osoba("Kierownik", "Haniek");


        Samochod skoda1 = new Samochod("WA0001", Marka.SKODA);
        Samochod skoda2 = new Samochod("SC36010", Marka.SKODA);
        Samochod mazda1 = new Samochod("WA012345", Marka.MAZDA);
        Samochod mazda2 = new Samochod("DW01ASD", Marka.MAZDA);
        Samochod bmw = new Samochod("WA12690", Marka.BMW);
        Samochod volvo = new Samochod("KR60606", Marka.VOLVO);


        HashMap<Osoba, Samochod> wlascicieleSamochodow = new HashMap<>();

        wlascicieleSamochodow.put(kowalski, skoda1);
        wlascicieleSamochodow.put(kowalski, bmw);
        wlascicieleSamochodow.put(nowak, mazda2);
        wlascicieleSamochodow.put(krawczyk, volvo);
        wlascicieleSamochodow.put(krawczyk, mazda1);
        wlascicieleSamochodow.put(krawczyk, skoda2);
        wlascicieleSamochodow.put(kowalski, null);


        System.out.println(wlascicieleSamochodow);
    }

}

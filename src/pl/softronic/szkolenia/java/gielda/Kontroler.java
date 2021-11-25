package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Kontroler {
// krok 2
    Gielda gielda;
    UrzadSkarbowy us;
    Pojazd pojazd;
    SamochodOsobowy so, so2, so3;
    Zaglowka zaglowka;

    public void uruchomProgram() {
        //Uruchamia metody: tworzącą i testujacą giełdę

        tworzGielde();
        wczytajDane();
        testujGielde();

    }

    private void wczytajDane() {
        
    }

    // mariusz 
    public void tworzGielde() {
        System.out.println("Tworzę giełdę");
// tworzymy giełdę
        gielda = new Gielda();
        gielda.setNazwa("Gielda MK");
        gielda.setAdres("Szczecin");
// tworzymy US
        us = new UrzadSkarbowy();
        us.setNazwa("Urzad Skarbowy MK");
        us.setAdres("Szczecin, Skarbowa");
    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");

        System.out.println(gielda);
        System.out.println(us);

        //testujemy pojazd
        pojazd = new Pojazd("O", "Mustang", 1969,300_000f,1,  1);
        System.out.println(pojazd);

        //testujemy samochod osobowy
        so = new SamochodOsobowy("O", "Mustang", 1969,300_000f,1,  1);
        so2 = new SamochodOsobowy("O", "Mustang", 1969,300_000f,1,  1);
        so3 = new SamochodOsobowy("O", "Mustang", 1969,300_000f,1,  1);
        so.setLiczbaMiejsc(5);
        so.setNadwozie("Sedan");
        so.setPojemnosc(6900);
        // so.setDataPrzegladu(LocalDate.parse("2.1.2"));

        System.out.println(so);

        //testujemy zaglowka
        zaglowka = new Zaglowka("Z", "Carina", 1999, 45_000f, 1,1);
        zaglowka.setDlugosc(750);
        zaglowka.setPowZagli(12);
        zaglowka.setLiczbaMiejsc(5);
        // so.setDataPrzegladu(LocalDate.parse("2.1.2"));

        System.out.println(zaglowka);


    // symulacj arzyjęcia auta
        // udajemy ze mamy sprzedawce i sprzedajacego

        int idSprzedawcy = 2;
        int idWlasciciela  = 2;
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so2);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so3);
        gielda.wyswietlSamochodyOsobowe();

        //jakie samochody są na giełdzie
     //   System.out.println(wyswietlSamochodyOsobowe);


    }
}

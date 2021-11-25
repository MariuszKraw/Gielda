package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Kontroler {
// krok 2
    Gielda gielda;
    UrzadSkarbowy us;
    Pojazd pojazd;
    SamochodOsobowy so;

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
        so.setLiczbaMiejsc(5);
        so.setNadwozie("Sedan");
        so.setPojemnosc(5900);
        // so.setDataPrzegladu(LocalDate.parse("2.1.2"));

        System.out.println(so);

    }
}

package pl.softronic.szkolenia.java.gielda;

import java.util.SplittableRandom;
import java.util.Vector;

public class Gielda {

    private String nazwa = "";
    protected String adres = "";

    Vector ListaSamochodowOsobowych = new Vector();


    public static void main(String[] args) {
        Kontroler kontroler = new Kontroler();
        kontroler.uruchomProgram();
    }
// krok trzeci
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Gielda{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }


    public void przyjmijSamochodOsobowy(int idSprzedawcy, int idWlasciciela, SamochodOsobowy so) {
        this.ListaSamochodowOsobowych.add(so);
        System.out.println("przyjąłem do sprzedaży: "+so.toString());

    }


    public void wyswietlSamochodyOsobowe(){
       if (this.ListaSamochodowOsobowych.size() == 0) {
           System.out.println("Brak samochodów");
       } else {
              System.out.println("Ilość dostępnych samochodów: " + this.ListaSamochodowOsobowych.size());
       }
        for (int i = 0; i < this.ListaSamochodowOsobowych.size(); i++) {
            System.out.println(this.ListaSamochodowOsobowych.elementAt(i));
        }
    }


    public void wycofajSamochod(int id) {
        int idPom = -1;

        for (int i = 0; i < this.ListaSamochodowOsobowych.size(); i++) {
            idPom = ((SamochodOsobowy) this.ListaSamochodowOsobowych.elementAt(i)).getId();

            if (idPom == id) {
                ((SamochodOsobowy) this.ListaSamochodowOsobowych.elementAt(i)).setStatus("W");)
                System.out.println("Wycofano samochod: " ((SamochodOsobowy this.ListaSamochodowOsobowych.elementAt(i))));
            }
        }
    }
}

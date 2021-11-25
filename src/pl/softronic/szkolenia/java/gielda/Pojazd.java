package pl.softronic.szkolenia.java.gielda;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.time.LocalDate;
import java.util.Date;

public class Pojazd {
    private int  id = 0;
    private String typPojazdu;
    private String marka;
    private String status;
    private int rok;
    private Float cena;
    private int idWlasciciela;
    private int idSprzedawca;
    private int idKupujacy;
    private LocalDate dataZgłoszenia;
    private LocalDate dataSprzedazy;
    private LocalDate dataWycofania;

    private Pojazd() {
    }



    public Pojazd(String typPojazdu, String marka, int rok, Float cena, int idWlasciciela, int idSprzedawca) {
        this.typPojazdu = typPojazdu;
        this.marka = marka;
        this.rok = rok;
        this.cena = cena;
        this.idWlasciciela = idWlasciciela;
        this.idSprzedawca = idSprzedawca;
    }

    public int getId() {
        return id;
    }

    public String getTypPojazdu() {
        return typPojazdu;
    }

    public String getMarka() {
        return marka;
    }

    public String getStatus() {
        return status;
    }

    public int getRok() {
        return rok;
    }

    public Float getCena() {
        return cena;
    }

    public int getIdWlasciciela() {
        return idWlasciciela;
    }

    public int getIdSprzedawca() {
        return idSprzedawca;
    }

    public int getIdKupujacy() {
        return idKupujacy;
    }

    public LocalDate getDataZgłoszenia() {
        return dataZgłoszenia;
    }

    public LocalDate getDataSprzedazy() {
        return dataSprzedazy;
    }

    public LocalDate getDataWycofania() {
        return dataWycofania;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }

    public void setIdWlasciciela(int idWlasciciela) {
        this.idWlasciciela = idWlasciciela;
    }

    public void setDataZgłoszenia(LocalDate dataZgłoszenia) {
        this.dataZgłoszenia = dataZgłoszenia;
    }

    public void setDataSprzedazy(LocalDate dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public void setDataWycofania(LocalDate dataWycofania) {
        this.dataWycofania = dataWycofania;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "typPojazdu='" + typPojazdu + '\'' +
                ", marka='" + marka + '\'' +
                ", rok=" + rok +
                ", cena=" + cena +
                '}';
    }
}

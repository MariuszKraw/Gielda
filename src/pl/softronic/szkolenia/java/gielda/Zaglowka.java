package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;

public class Zaglowka extends Pojazd {
    private int liczbaMiejsc = 5;
    private LocalDate dataPrzegladu;
    private float powZagli = 0;
    private float dlugosc = 0;


    public Zaglowka(String typPojazdu, String marka, int rok, Float cena, int idWlasciciela, int idSprzedawca) {
        super(typPojazdu, marka, rok, cena, idWlasciciela, idSprzedawca);
    }

    public Zaglowka(String typPojazdu, String marka, int rok, Float cena, int idWlasciciela, int idSprzedawca, int liczbaMiejsc, String nadwozie, int pojemnosc, LocalDate dataPrzegladu) {
        super(typPojazdu, marka, rok, cena, idWlasciciela, idSprzedawca);
        this.liczbaMiejsc = liczbaMiejsc;
        this.dataPrzegladu = dataPrzegladu;
        this.powZagli = powZagli;
        this.dlugosc = dlugosc;
    }

    public float getPowZagli() {
        return powZagli;
    }

    public void setPowZagli(float powZagli) {
        this.powZagli = powZagli;
    }

    public float getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }


    public LocalDate getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(LocalDate dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    @Override
    public String toString() {
        return "Zaglowka{" +
                "marka=" + this.getMarka() +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", dataPrzegladu=" + dataPrzegladu +
                ", powZagli=" + powZagli +
                ", dlugosc=" + dlugosc +
                '}';
    }
}
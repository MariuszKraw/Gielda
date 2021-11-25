package pl.softronic.szkolenia.java.gielda;

public class UrzadSkarbowy {

    private String nazwa = "";
    protected String adres = "";

// kopijemy Gielda w Project i wklejamy jako UrzadSkabowy
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
        return "Urząd Skarbowy{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}

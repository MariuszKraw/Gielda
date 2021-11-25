package pl.softronic.szkolenia.java.gielda;

public class Kontroler {
// krok 2
    Gielda gielda;

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

        gielda = new Gielda();
        gielda.setNazwa("Gielda MK");
        gielda.setAdres("Szczecin");
    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");
    }
}

package Practica.practicum4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;
    }
    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}


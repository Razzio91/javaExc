package Practica.practicum4B;

public class Klant {

    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }
//    For testing's sake:
//    public Klant(String nm, double kP){
//        naam = nm;
//        kortingsPercentage = kP;
//    }
    public void setKorting(double kP){
            kortingsPercentage = kP;
    }
    public double getKorting(){
        return kortingsPercentage;
    }
    @Override
    public String toString(){
        String tekstKlant;
        if (naam == null || naam.equals("")) {
            tekstKlant = "er is geen huurder bekend";
        } else {
            tekstKlant = "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
        }
        return tekstKlant;
    }
}

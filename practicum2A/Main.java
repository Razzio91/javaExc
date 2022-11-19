package Practica.practicum2A;

public class Main {
    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("Breedte: " +z1.getBreedte());
        System.out.println("Lengte: " + z1.getLengte());
        System.out.println("Diepte: " + z1.getDiepte());
        System.out.println("Berekende inhoud: "+ z1.inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad();
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("Gegevens zwembad: " + z2.toString());
        System.out.println("Berekende inhoud: " + z2.inhoud());

    }
}

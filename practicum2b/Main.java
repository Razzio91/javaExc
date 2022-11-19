package Practica.practicum2b;

public class Main {
    public static void main(String[] args) {

        VoetbalClub ajx = new VoetbalClub("Ajax      ");
        VoetbalClub fey = new VoetbalClub("Feijenoord");

        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + fey.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();
        System.out.println(ajx);
        System.out.println(fey);


    }
}

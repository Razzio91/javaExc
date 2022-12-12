package Practica.practicum3A;

public class Main {
    public static void main(String[] args) {

        VoetbalClub fc = new VoetbalClub(null);
        VoetbalClub ajx = new VoetbalClub("Ajax      ");
        VoetbalClub fey = new VoetbalClub("Feijenoord");

        fc.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + fey.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println("FC gespeeld: " + fc.aantalGespeeld());
        System.out.println();
        System.out.println(fey);
        System.out.println(ajx);
        System.out.println(fc);
    }
}

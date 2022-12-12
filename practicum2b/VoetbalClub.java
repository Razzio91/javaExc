package Practica.practicum2b;
import week1.les1.opdracht2.Persoon;
public class VoetbalClub {
    private String naam;
    private int aantalWedstrijden;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int totaalPunten;

    public VoetbalClub(String vcb) {
        naam = vcb;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String nm) {
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }
        aantalWedstrijden++;
    }
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
           }
    public int aantalPunten() {
        totaalPunten = (aantalGewonnen * 3) + aantalGelijk;
        return totaalPunten;
    }
    public String toString() {
        return naam + " " + aantalWedstrijden + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + totaalPunten;
    }
}

package Practica.practicum3A;

import java.util.Objects;

public class VoetbalClub {
    protected String naam;
    protected int aantalWedstrijden;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    protected int totaalPunten;


    public VoetbalClub(String vcb) {
//        Vragen naar verschil:
//        vcb == "" || Objects.equals(vcb, "")
        if (Objects.equals(vcb, "") || vcb == null) {
            naam = "FC";
        } else {
            naam = vcb;
        }
    }

    public void verwerkResultaat(char ch) {
             if (ch == 'w') {
                aantalGewonnen = aantalGewonnen + 1;
                aantalWedstrijden++;
                totaalPunten += 3;
            }
            if (ch == 'g') {
                aantalGelijk = aantalGelijk + 1;
                aantalWedstrijden++;
                totaalPunten += 1;
            }
            if (ch == 'v') {
                aantalVerloren = aantalVerloren + 1;
                aantalWedstrijden++;
            }
        }
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

@Override
    public String toString() {
        return naam + " " + aantalWedstrijden + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + totaalPunten;
    }
}

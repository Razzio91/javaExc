package Practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        this.leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l) {
        if (!leerlingen.contains(l)) {
            leerlingen.add(l);
        }
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().contains(nm)) {
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String zinnetje = "";

        for (Leerling leerling : leerlingen) {
            zinnetje += leerling.toString();

        }
        return "In klas " + klasCode + " zitten de volgende leerlingen: \n" + zinnetje;
    }
}
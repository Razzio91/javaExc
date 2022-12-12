package Practica.practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
            type = tp;
            prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        String tekstAuto;
        if (type == null || type.equals("")) {
            tekstAuto = "er is geen auto bekend";
        } else {
            tekstAuto = type + " met prijs per dag: " + prijsPerDag;
        }
        return tekstAuto;
    }
}

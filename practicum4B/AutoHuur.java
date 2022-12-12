package Practica.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {

    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        double result;
        if(huurder == null){
            result = 0.0;
        }else if (gehuurdeAuto == null){
            result = 0.0;
        }else if (huurder.getKorting() <= 0) {
            result = getGehuurdeAuto().getPrijsPerDag() * getAantalDagen();
        } else{
            double prijsExclusiefKorting = gehuurdeAuto.getPrijsPerDag() * getAantalDagen();
            double huurKortPerc = (huurder.getKorting() / 100);
            double berekening = prijsExclusiefKorting * huurKortPerc;
            result = prijsExclusiefKorting - berekening;
        }
        return result;
    }

    @Override
    public String toString() {
        String tekstAutoHuur;
       if (getGehuurdeAuto() == null && getHuurder() == null) {
            tekstAutoHuur = "er is geen auto bekend" + "\n" + "er is geen huurder bekend" + "\naantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
        } else if (getGehuurdeAuto() == null){
            tekstAutoHuur = "er is geen auto bekend" + "\n" + getHuurder() + "\naantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
        } else if (getHuurder() == null) {
           tekstAutoHuur = "autotype: " + getGehuurdeAuto() + "\n" + "er is geen huurder bekend" + "\naantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
       } else {
           tekstAutoHuur = "autotype: " + getGehuurdeAuto() + "\n" + getHuurder() + "\naantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
       }
        return tekstAutoHuur;
    }
}

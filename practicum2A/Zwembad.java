package Practica.practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad (){

    }
    public Zwembad(double brd, double lng, double die){
        breedte = brd;
        lengte = lng;
        diepte = die;
    }

    public double getBreedte(){
        return breedte;
    }
    public void setBreedte(double bred){
        breedte = bred;
    }
    public double getLengte(){
        return lengte;
    }
    public void setLengte(double leng){
        lengte = leng;
    }
    public double getDiepte(){
        return diepte;
    }
    public void setDiepte(double deep){
        diepte = deep;
    }
    public double inhoud(){
        return breedte * lengte * diepte;
    }
    @Override
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " lang, en " + diepte + " meter diep";
    }

}

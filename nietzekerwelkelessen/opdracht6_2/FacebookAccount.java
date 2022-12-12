package Practica.nietzekerwelkelessen.opdracht6_2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> vrienden;

    public FacebookAccount(String nm) {
        this.naam = nm;
        this.vrienden = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV) {
        if (!vrienden.contains(nwV)) {
            vrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV) {
        return vrienden.remove(exV);
    }

    public boolean isVriendMet(Vriend v) {
        return vrienden.contains(v);
    }

    public int aantalVrienden() {

        return vrienden.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naam);

        if(aantalVrienden() > 0){
            sb.append(" heeft " + aantalVrienden() + " vrienden:\n");

        }else{
            sb.append(" heeft nog geen vrienden!");
        }
        return sb.toString();
}}

package Practica.practicum3B;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;
//Beredenering voor weghalen try{}catch(){}
//        Tijdens uitvoer gaat hij kapot:
//        Breekt omdat Cirkel een new exception gooit en die nooit wordt
//        gevangen in het tryCatch blok
        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
//    Verklaring:
//        De code stopt met uitvoeren, omdat het een error veroorzaakt,
//        dit komt omdat de Cirkel klasse een exception
//        gooit dat nooit gevangen wordt in een try catch clausule.
}

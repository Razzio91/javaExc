package Practica.practicum1;

public class Main {
    public static void main(String[] args) {
//Opdracht 1:
        System.out.println("Opdracht 1: ");
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }
        System.out.println();
//Opdracht 2:
        System.out.println("Opdracht 2: ");
        int count = 1;
        while (count < 11){
            System.out.println("Count is: " + count);
            count++;
        }
        System.out.println();
//Opdracht 3:
        System.out.println("Opdracht 3: ");
        double max = 1.0;
        double min = 0.0;
        double range = max - min;
        for (int i = 0; i < 10; i++) {
            double rand = (Math.random() * range) + min;
            System.out.println(Math.round(rand * 10.0) / 10.0);
        }
        System.out.println();
//Opdracht 4:
        System.out.println("Opdracht 4: ");
        int num = 0;
        for (int i = 0; i <= 39; i++) {
            num += i;
        }
        System.out.println(num);
        System.out.println();
//Opdracht 5:
        System.out.println("Opdracht 5: ");
        for (int i = 0; i < 4; i++) {
            if ((i % 2) == 0) {
                System.out.println("s");
            } else {
                System.out.println("ss");
            }
        }
    }
}

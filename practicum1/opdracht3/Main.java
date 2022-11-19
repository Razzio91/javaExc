package Practica.practicum1.opdracht3;

public class Main {
    public static void main(String[] args) {

      double max = 1.0;
      double min = 0.0;
      double range = max - min;

      for(int i =0; i < 10; i++){
          double rand = (Math.random() * range) + min;
          System.out.println(Math.round(rand * 10.0) / 10.0);
      }
}}

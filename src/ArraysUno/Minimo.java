package ArraysUno;

import java.util.Scanner;

public class Minimo {
    public static void main(String[] args) {
        int[] Array = new int[10];
        int minimo;
        Scanner inputValu = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            Array[i] = inputValu.nextInt();
        }

        minimo = Array[0];

        for (int i : Array){
            if (i < minimo){
                minimo = i;
            }
        }
        System.out.println("El numero mas pequeño es el: "+minimo);
        inputValu.close();
    }
}
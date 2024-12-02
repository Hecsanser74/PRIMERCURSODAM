package ArraysUno;

import java.util.Scanner;

public class OrdenInverso {
    public static void main(String[] args) {
        int[] Array;
        Scanner inputValu = new Scanner(System.in);

        Array = new int[10];

        for (int i = 0; i < Array.length; i++){
            System.out.println("Introduce un numero: ");
            Array[i] = inputValu.nextInt();
            }

        for (int i = Array.length - 1; i >= 0; i--){
            System.out.println(Array[i]);

            inputValu.close();
        }
    }
}
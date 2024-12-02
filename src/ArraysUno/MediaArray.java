package ArraysUno;

import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        int[] Array;
        int suma = 0;
        int media;
        Scanner inputValu = new Scanner(System.in);

        Array = new int[10];

        for (int i = 0; i < Array.length; i++){
            System.out.println("Introduce un numero: ");
            Array[i] = inputValu.nextInt();
        }

        for (int i : Array){
            suma += i;
        }

        media = suma / Array.length;
        System.out.printf("La media de la array es: "+media);
        inputValu.close();
    }
}

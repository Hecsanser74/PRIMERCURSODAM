package ArraysUno;

import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        int[] Array = new int[10];
        int maximo = 0;
        Scanner inputValu = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Introduce un numero: ");
            Array[i] = inputValu.nextInt();
        }
        for (int i : Array){
           if (i > maximo) maximo = i;
        }
        System.out.println("El numero mas grande es: "+maximo);
        inputValu.close();
    }
}

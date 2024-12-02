package ArraysUno;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero: ");
            numeros[i] = inputValue.nextInt();
            if (numeros[i] % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Los numeros impares que hay son: "+impares);
        System.out.println("Los numeros pares que hay son: "+pares);
    }
}
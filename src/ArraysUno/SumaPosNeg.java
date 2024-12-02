package ArraysUno;

import java.util.Scanner;

public class SumaPosNeg {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero: ");
            numeros[i] = inputValue.nextInt();
            if (numeros[i] >= 0) positivos += numeros[i];
            else negativos += numeros[i];
        }

        System.out.println("Suma de todos los positivos: "+positivos);
        System.out.println("Suma de todos los negativos: "+negativos);

    }
 }

package ArraysDos;

import Utilidades.Utilidades;

import java.util.Scanner;

public class SegundoMayor {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 1, 100);

        System.out.print("Arreglo original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        int mayor = numeros[0];
        int segundomayor = -1;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                segundomayor = mayor;
                mayor = numeros[i];
            } else if (numeros[i] > segundomayor && numeros[i] != mayor) {
                segundomayor = numeros[i];
            }
        }

        System.out.println("El segundo numero mayor es: " + segundomayor);
    }
}


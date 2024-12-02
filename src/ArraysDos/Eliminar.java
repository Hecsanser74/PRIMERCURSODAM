package ArraysDos;

import Utilidades.Utilidades;

import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creas array y la rellenas
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 1, 50);

        //Printeas el original
        System.out.print("Arreglo original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Pides que posicion quiere eliminar
        System.out.print("Introduce la posición a eliminar: ");
        int posicion = sc.nextInt();


        for (int i = posicion; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        numeros[numeros.length - 1] = numeros[posicion];

        System.out.print("Arreglo modificado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


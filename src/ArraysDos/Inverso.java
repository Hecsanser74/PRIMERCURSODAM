package ArraysDos;

import Utilidades.Utilidades;

import java.util.Scanner;

    public class Inverso {
        public static void main(String[] args) {
            Scanner inputValue = new Scanner(System.in);
            int[] numeros = new int[10];
            Utilidades.rellenaArray(numeros, 0, 10);

            System.out.print("Arreglo original: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] numeros2 = new int[10];
            int contador = numeros.length - 1;
            for (int i = 0; i < numeros.length; i++) {
                numeros2[i] = numeros[contador];
                contador--;
            }

            System.out.print("Arreglo invertido del final al principio: ");
            for (int num : numeros2) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}

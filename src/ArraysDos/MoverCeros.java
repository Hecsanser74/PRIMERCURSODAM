package ArraysDos;

import Utilidades.Utilidades;
import java.util.Scanner;

public class MoverCeros {
        public static void main(String[] args) {
            Scanner inputValue = new Scanner(System.in);
            int[] numeros = new int[10];
            Utilidades.rellenaArray(numeros, 0, 1);

            System.out.print("Arreglo original con los 0 aleatorio: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();

            int posicion = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] != 0) {
                    numeros[posicion] = numeros[i];
                    posicion++;
                }
            }

            for (int j = posicion; j < numeros.length; j++){
                numeros[j] = 0;
            }

            System.out.print("Arreglo modificado con 0 al final: ");

            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}



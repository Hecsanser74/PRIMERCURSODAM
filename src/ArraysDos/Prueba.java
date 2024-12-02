package ArraysDos;

import Utilidades.Utilidades;

import java.util.Scanner;

public class Prueba {
    public static void main (String[] args){
        int numero;
        int[] array = new int[10];
        String contador = "";
        Utilidades.rellenaArray(array, 1, 50);
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Escribe aqui un numero para ver que pares, sumados, dan este numero: ");
        numero = inputValue.nextInt();

        for (int i : array){
            if (i % 2 == 0) {
                for (int j = array[i + 1]; j < array.length; j++) {
                    if (j % 2 == 0){
                        if (array[i] + array[j] == numero) {
                            contador += array[i];
                            contador += array[j];
                        } else break;
                    }
                }
            }
        }

        System.out.println("Los numeros que sumados dan el numero introducido son: "+contador);
        inputValue.close();

    }
}

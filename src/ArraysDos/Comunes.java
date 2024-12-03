package ArraysDos;

import Utilidades.Utilidades;

//hdhd

public class Comunes {
    public static void main(String[] args) {

        //Creamos las arrays y ponemos el margen
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 1, 100);

        int[] numeros2 = new int[10];
        Utilidades.rellenaArray(numeros2, 1, 100);

        int[] duplicado = new int[10];

        //Printeo las dos arrays para saber los numeros
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : numeros2) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Comprobamos si hay numeros comunes en las arrays
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros[i] == numeros2[j] && numeros2[j] != 0) {
                    duplicado[i] = numeros[i];
                    break;
                }
            }
        }

        //Printeamos los numeros que se han duplicado
        System.out.println();
        System.out.println("Los valores duplicados son los siguientes: ");

        for (int num : duplicado) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }
}
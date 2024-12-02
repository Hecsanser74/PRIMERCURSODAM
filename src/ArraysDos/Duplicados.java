package ArraysDos;

import Utilidades.Utilidades;

public class Duplicados {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 1, 10);
        int[] duplicado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j] && numeros[i] != 0) {
                    duplicado[i] = numeros[i];  // Guardar el duplicado
                    numeros[j] = -1;           // Marcar el elemento duplicado como procesado
                }
            }
        }

        System.out.println("Los numeros que estan duplicados son los siguientes: ");

        for (int num : duplicado) {
            if (num > 0) {
                System.out.println(num);
            } else if (num < 0) {
                System.out.println("No hay numeros duplicados");
            }
        }

    }
}

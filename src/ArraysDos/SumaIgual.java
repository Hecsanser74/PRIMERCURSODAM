package ArraysDos;

import Utilidades.Utilidades;

import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {

        //Creo este entero para que cuente cuantas sumas hay
        int contadorSumas = 0;

        //Creamos las arrays y les ponemos el margen
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 1, 100);

        int[] numeros2 = new int[10];
        Utilidades.rellenaArray(numeros2, 1, 100);

        //Pedimos que introduzca el numero
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = inputValue.nextInt();

        //Printeamos las dos arrays
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }
        System.out.println();

        System.out.println("Con los numeros aleatorios y el introducido, esta es la suma: ");

        //Calculamos si algun numero de una array sumada con algun numero de la otra da de resultado el numero introducido
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros[i] + numeros2[j] == num) {
                    contadorSumas++;
                    System.out.println(numeros[i] + " + " + numeros2[j] + " = " + num);
                }
            }
        }
        if (contadorSumas <= 0) System.out.println("No se puede realizar la suma :(");
    }
}





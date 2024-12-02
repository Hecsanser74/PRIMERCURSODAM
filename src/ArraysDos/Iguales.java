package ArraysDos;

import Utilidades.Utilidades;

public class Iguales {
    public static void main(String[] args) {
                int[] numeros = new int[10];
                Utilidades.rellenaArray(numeros, 1, 100);

                int[] numeros2 = numeros.clone();


                for (int num : numeros) {
                    System.out.print(num + " ");
                }
                System.out.println();

                for (int num : numeros2) {
                    System.out.print(num + " ");
                }
                System.out.println();

                sonIguales(numeros, numeros2);
            }

            public static boolean sonIguales(int[] numeros, int[] numeros2) {
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] != numeros2[i]) {
                        System.out.println("No son iguales");
                        return false;
                    }
                }
                System.out.println("Son iguales");
                return true;
            }
        }




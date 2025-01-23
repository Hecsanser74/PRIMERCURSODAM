package Metodos.AlgorMetodo;

import Utilidades.Utilidades;

public class NumeroGrande {
    public static void main(String[] args) {
        int numero = Utilidades.leerEntero("Introduce aqui un numero:");
        int numero2 = Utilidades.leerEntero("Introduce aqui otro numero:");

        System.out.println("El numero mas grande es: " +valorGrande(numero, numero2));
    }

    public static int valorGrande(int numero, int numero2) {
        if (numero > numero2) {
            return numero;
        } else {
            return numero2;
        }
    }
}



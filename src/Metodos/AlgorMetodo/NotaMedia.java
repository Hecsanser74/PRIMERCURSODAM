package Metodos;

import Utilidades.Utilidades;
import java.util.Arrays;

public class NotaMedia {
    public static void main (String[] args){
        int[] notas = new int[10];
        Utilidades.rellenaArray(notas,1,10);
        System.out.println(Arrays.toString(notas));
        int numeroBuscado = Utilidades.leerEntero("Introduce un numero que quieras buscar: ");

        System.out.println("La nota media de las notas es: "+calculaNota(notas));

        if (hayNumero(notas, numeroBuscado)){
            System.out.println("Si que estaba el numero que querias buscar");
        }
    }

    /**
     * Creamos entero con cantidad 0 que ira sumando segun se pongan las notas gracias al for.
     * @param notas
     * @return nota media
     */
    public static double calculaNota(int[] notas){
        int sumaDeNumeros = 0;
        for (int i : notas){
            sumaDeNumeros += i;
        }
        return (sumaDeNumeros / notas.length);
    }

    /**
     * Calculamos con el for que si algun numero de la array es igual al numero buscado, con el boolean devuelva true.
     * @param notas
     * @param numeroBuscado
     * @return si esta el numero
     */
    public static boolean hayNumero (int[] notas, int numeroBuscado){
        for (int i : notas){
            if (i == numeroBuscado) return true;
        }
    return false;
    }
}

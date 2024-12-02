import Utilidades.Utilidades;

import java.util.Arrays;

public class EncontrarValor {
    public static void main(String[] args) {
        int[] numero = new int[50];
        int numeroBuscado;

        Utilidades.rellenaArray(numero,-10,10);
        System.out.println(Arrays.toString(numero));

        numeroBuscado = Utilidades.leerEntero("Introduce un numero que quieras buscar: ");

        if (buscaValor(numero, numeroBuscado)) {
            System.out.println("El numero esta en la array " +numeroBuscado);
        } else System.out.printf("El numero no esta en la array " +numeroBuscado);
    }

    public static boolean buscaValor(int[] numero, int numeroBuscado) {
        for (int num : numero) {
            if (num == numeroBuscado) return true;
        }
        return false;
    }
}
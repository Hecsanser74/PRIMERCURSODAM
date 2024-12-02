package ArraysUno;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        char[] vocales = {'a','e','i','o','u'};
        String cadena;
        int contadorVocales = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        cadena = inputValue.nextLine();

        for (int i = 0; i < cadena.length(); i++){
            for (int j : vocales) {
                if (cadena.charAt(i) == j) contadorVocales++;
            }
        }

        System.out.println("La cadena tiene estas vocales: "+contadorVocales);

    }
}
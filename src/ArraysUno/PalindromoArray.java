package ArraysUno;

import java.util.Scanner;

public class PalindromoArray {
    public static void main(String[] args) {
        boolean esPalindromo = true;
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena:");
        String cadena = miScanner.nextLine();

        miScanner.close();

        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++){
            caracteres[i] = cadena.charAt(i);
        }
        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - i - 1]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena es palíndroma");
        } else {
            System.out.println("La cadena NO es palíndroma");
        }
    }
}

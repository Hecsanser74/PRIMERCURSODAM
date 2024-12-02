package ArraysUno;

import java.util.Scanner;

public class DniSinLetra {
    public static void main(String[] args) {
        char[] Array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K'};
        int numerosDNI;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce los numeros de tu DNI: ");
        numerosDNI = inputValue.nextInt();

        int residuo = numerosDNI % 23;

        System.out.println(Array[residuo]);

        inputValue.close();
    }
}
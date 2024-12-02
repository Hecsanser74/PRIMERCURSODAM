import java.util.Scanner;

public class Comparar {
    public static void main (String[] args){
        String cadena1;
        String cadena2;
        int resultado = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        cadena1 = inputValue.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        cadena2 = inputValue.nextLine();

        resultado = cadena1.compareTo(cadena2);

        if (resultado < 0) {
            System.out.println("La cadena " + cadena1 + " es mayor que " + cadena2);
        } else if (resultado > 0) {
            System.out.println("La cadena " + cadena1 + " es menor que " + cadena2);
        } else System.out.println("La cadena " + cadena1 + " y " + cadena2 + " son iguales");

    }

}



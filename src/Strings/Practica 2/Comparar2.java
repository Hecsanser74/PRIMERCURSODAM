import java.util.Scanner;

public class Comparar2 {
    public static void main (String[] args){
        String cadena1;
        String cadena2;
        int resultado = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        cadena1 = inputValue.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        cadena2 = inputValue.nextLine();


        if (cadenaMayor(cadena1, cadena2, resultado) > 0) {
            System.out.println("La cadena "+cadena1+" es menor que "+cadena2);
        } else if (cadenaMayor(cadena1, cadena2, resultado) < 0) {
            System.out.println("La cadena "+cadena1+" es mayor que "+cadena2);
        } else {
            System.out.println("La cadena "+cadena1+" y "+cadena2+" son iguales");
        }

    }
    public static int cadenaMayor (String cadena1, String cadena2, int resultado){
        resultado = cadena1.compareToIgnoreCase(cadena2);
        return resultado;
    }

}

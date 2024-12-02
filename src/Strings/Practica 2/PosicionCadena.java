import java.util.Scanner;

public class PosicionCadena {
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        int resultado = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce otra cadena: ");
        cadena2 = inputValue.nextLine();

        System.out.println(ocurrencia(cadena1, cadena2, resultado));

    }
    public static int ocurrencia (String cadena1, String cadena2, int resultado){
        resultado = cadena1.lastIndexOf(cadena2);
        return resultado;
    }
}

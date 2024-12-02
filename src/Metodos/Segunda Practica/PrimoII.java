import java.util.Scanner;

public class PrimoII {
    public static boolean esPrimo(int numero) {
        boolean primo;
        int divisor = 3;

        primo = numero % 2 != 0 || numero == 2;

        while (divisor < numero / 2) {
            if (numero % divisor == 0) {
                primo = false;
                break;
            }
            divisor = divisor + 2;
        }
        return primo;
    }

    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        numero = inputValue.nextInt();

        if (esPrimo(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}


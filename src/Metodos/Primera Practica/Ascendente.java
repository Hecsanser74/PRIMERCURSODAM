import java.util.Scanner;

public class Ascendente {
    public static void ascendente(int numero1, int numero2) {
        if (numero1 >= numero2) {
            System.out.println(numero2 + ", " + numero1);
        } else {
            System.out.println(numero1 + ", " + numero2);
        }
    }
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();

        ascendente(numero1, numero2);

    }
}


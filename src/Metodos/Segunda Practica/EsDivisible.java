import java.util.Scanner;

public class EsDivisible {
    public static boolean Mayor(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();

        if (Mayor(numero1, numero2)){
            System.out.println("Los numeros son divisibles entre si");
        } else System.out.println("Los numeros no son divisibles entre si");
    }
}


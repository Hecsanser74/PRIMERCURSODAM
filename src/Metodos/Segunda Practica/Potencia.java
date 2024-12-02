import java.util.Scanner;

public class Potencia {
    public static double elevado(double numero1, int numero2) {
        if (numero2 == 0) return 1;
        return numero1 * elevado(numero1, numero2 -1);

    }
    public static void main(String[] args) {
        double numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce que numero quieres elevar: ");
        numero1 = inputValue.nextDouble();
        System.out.println("Introduce a que quieres elevar: ");
        numero2 = inputValue.nextInt();

        System.out.println(elevado(numero1, numero2));
    }
}


import java.util.Scanner;

public class MayorDeTres {
    public static void Mayor(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mas grande es el "+numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mas grande es el "+numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El numero mas grande es el "+numero3);
        } else System.out.println("Valores incorrectos");
    }
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();
        System.out.println("Introduce el tercer numero: ");
        numero3 = inputValue.nextInt();

        Mayor(numero1, numero2, numero3);

    }
}


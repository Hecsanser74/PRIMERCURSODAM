import java.util.Scanner;

public class EsTriangulo {
    public static boolean triangulo(int palito1, int palito2, int palito3) {

        if ((palito1 + palito2 < palito3) || (palito2 + palito3 < palito1) || (palito1 + palito3 < palito2) ) {
            return false;
        } else return true;
    }
    public static void main(String[] args) {
        int palito1;
        int palito2;
        int palito3;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        palito1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        palito2 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        palito3 = inputValue.nextInt();

        if (triangulo(palito1, palito2, palito3)){
            System.out.println("Los numeros pueden formar triangulo");
        } else System.out.println("Los numeros no pueden formar triangulo ");
    }
}


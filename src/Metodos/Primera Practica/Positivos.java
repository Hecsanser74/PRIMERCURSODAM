import java.util.Scanner;

public class Positivos {
    public static void positivo(int[] numeros) {
            int contador= 0;
            for (int i : numeros){
                if (i >= 0){
                    contador++;
                }
            }
        System.out.println(contador);
        }
    public static void main(String[] args){
            int[] numeros = new int[10];

            Scanner inputValue = new Scanner(System.in);

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Introduce un numero: ");
                numeros[i] = inputValue.nextInt();
            }
            positivo(numeros);
    }
}

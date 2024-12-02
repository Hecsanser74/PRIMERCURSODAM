import java.util.Scanner;

public class PositivosII{
        public static int positivos(int[] numero) {
            int contador = 0;
            for (int i : numero){
                if (i >= 0){
                    contador++;
                }
            }
            return contador;
        }
        public static void main(String[] args) {
            int[] numero = new int[10];
            Scanner inputValue = new Scanner(System.in);

            for (int i = 0; i < numero.length; i++) {
                System.out.println("Introduce un numero: ");
                numero[i] = inputValue.nextInt();
            }

            System.out.println(positivos(numero));
        }
}

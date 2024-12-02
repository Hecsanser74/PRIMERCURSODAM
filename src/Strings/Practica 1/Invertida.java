import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        String texto;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        String[] palabras = texto.split(" ");

        for (int i = palabras.length - 1; i >= 0; i--){
            System.out.print(palabras[i] + " ");
        }
    }
}

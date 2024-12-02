import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        String texto;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].equals(palabras[i].toLowerCase())){
                if (i != palabras.length - 1) i++;
            }
            if (Character.isUpperCase(palabras[i].charAt(0))) System.out.print(palabras[i].charAt(0));
        }

    }
}

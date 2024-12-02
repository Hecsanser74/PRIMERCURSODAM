import java.util.Scanner;

public class Longitud2 {
    public static void main (String[] args){
        String texto;
        int letras;
        int contadorLetras = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        System.out.println("Introduce un numero, para saber si hay alguna palabra con esa longitud: ");
        letras = inputValue.nextInt();

        String[] palabras = texto.split(" ");

        for (String i : palabras){
            if (i.length() == letras) contadorLetras++;
        }

        if (contadorLetras > 0){
        System.out.println("Si que hay alguna palabra con esas letras");
    }
}
}

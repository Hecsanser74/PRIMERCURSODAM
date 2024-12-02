import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Longitud {
    public static void main (String[] args){
        String texto;
        int letras;
        int contadorLetras = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        System.out.println("Introduce un numero, para saber cuantas palabras en la cadena tienen esa longitud: ");
        letras = inputValue.nextInt();

        String[] palabras = texto.split(" ");

        for (String i : palabras){
            if (i.length() == letras) contadorLetras++;
        }


        System.out.println("Las palabras que tienen el numero de letras introducidas son: " +contadorLetras);
    }
}

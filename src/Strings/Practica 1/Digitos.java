import java.util.Scanner;

public class Digitos {
    public static void main(String[] args){
        String texto;
        int contadorLetras = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) contadorLetras++;
        }

        System.out.println("La cadena tiene estos digitos: "+contadorLetras);
    }
}

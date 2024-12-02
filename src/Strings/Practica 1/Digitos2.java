import java.util.Scanner;

public class Digitos2 {
    public static void main(String[] args){
        String texto;
        int contadorLetras = 0;
        int contadorNum = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        String[] numeros = texto.split(" ");

        for (String palabra : numeros) {
            for (int i = 0; i < palabra.length(); i++){
                if (Character.isDigit(palabra.charAt(i))) contadorNum++;
                if (contadorNum == palabra.length()) {
                    contadorLetras++;
                    contadorNum = 0;
                    break;
                }
            }
        }

        System.out.printf("La cadena tiene estos digitos: "+contadorLetras);
    }
}

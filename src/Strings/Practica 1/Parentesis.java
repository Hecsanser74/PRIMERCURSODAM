import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        String texto;
        boolean malParentesis = true;
        int contadorCerrado = 0;
        int contadorAbierto = 0;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui una cadena de texto: ");
        texto = inputValue.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ')') contadorCerrado++;
            if (texto.charAt(i) == '(') contadorAbierto++;
            if (contadorCerrado > contadorAbierto) {
                System.out.println("Esta mal parentizado");
                malParentesis = false;
                break;
            }
        }

        if (malParentesis) {
            if (contadorAbierto == contadorCerrado) System.out.println("Esta bien parentizado");
            else System.out.println("Esta mal parentizado");
        }
    }
}

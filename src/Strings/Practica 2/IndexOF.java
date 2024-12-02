import java.util.Scanner;

public class IndexOF {
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        int respuesta = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce la segunda: ");
        cadena2 = inputValue.nextLine();

        System.out.println("La cadena dos esta en la cadena uno en esta posicion: "+posicion(cadena1, cadena2, respuesta));

    }
    public static int posicion (String cadena1, String cadena2, int respuesta){
        respuesta = cadena1.indexOf(cadena2);
        return respuesta;
    }
}

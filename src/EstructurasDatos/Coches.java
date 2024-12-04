package EstructurasDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<String>();
        String marca = "";
        int contador = 1;
        System.out.println("Vas a porceder a añadir marcas de coche, para detenr pulsa enter sin nada escrito en la consola");
        System.out.println("-----------------------------------------------------------------------------------------------");

        while (true) {
            System.out.println("Introduce una marca de coche: ");
            marca = scanner.nextLine();

            if (marca.isBlank()) break;

            coches.add(marca);
        }
        System.out.println("---------------------");
        System.out.println("Listado de los coches:");
        for (String coche : coches){
            System.out.println(contador + ". " + coche);
            contador++;
        }
    }
}
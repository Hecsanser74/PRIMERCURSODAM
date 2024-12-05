package EstructurasDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<String>();
        String marca = "";
        int contador = 1;
        System.out.println("Escribe aqui marcas de coches, para terminar pulsa enter (vacio): ");

        while (true) {
            System.out.println("Escribe la marca del coche: ");
            marca = scanner.nextLine();

            if (marca.isBlank()) break;

            coches.add(marca);
        }
        System.out.println("Listado de los coches:");
        for (String coche : coches){
            System.out.println(contador + ". " + coche);
            contador++;
        }
    }
}
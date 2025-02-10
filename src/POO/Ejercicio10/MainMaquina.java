package POO.Ejercicio10;

import java.util.Scanner;

public class MainMaquina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaExpendedora maquina = new MaquinaExpendedora(1.50);

        System.out.println("MAQUINA EXPENDEDORA");
        System.out.println("······················");
        System.out.println("Precio del ticket: "+maquina.getPrecioTicket()+"€");

        while (true) {
            System.out.println("Que quieres hacer: ");
            System.out.println("1. Insertar el dinero");
            System.out.println("2. Sacar ticket");
            System.out.println("3. Cerrar y Salir");
            System.out.print("Seleccione una opción:");

            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Cantidad deseada: ");
                double importe = scanner.nextDouble();
                maquina.insertarDinero(importe);
            } else if (opcion == 2) {
                System.out.println(maquina.sacarTicket());
            } else if (opcion == 3) {
                System.out.println("MAQUINA EXPENDEDORA CERRADA");
                break;
            } else {
                System.out.println("Esta opcion no es valida.");
            }
        }

        scanner.close();
    }
}

package BasesDatos.SQLite;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión - Biblioteca ===");
            System.out.println("1. Añadir un nuevo libro");
            System.out.println("2. Consultar un libro por ISBN");
            System.out.println("3. Actualizar un libro por ISBN");
            System.out.println("4. Eliminar un libro por ISBN");
            System.out.println("5. Mostrar todos los libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    BasesDatos.SQLite.Biblioteca.añadirLibro();
                    break;
                case 2:
                    BasesDatos.SQLite.Biblioteca.consultarLibroPorISBN();
                    break;
                case 3:
                    BasesDatos.SQLite.Biblioteca.actualizarLibroPorISBN();
                    break;
                case 4:
                    BasesDatos.SQLite.Biblioteca.eliminarLibroPorISBN();
                    break;
                case 5:
                    BasesDatos.SQLite.Biblioteca.mostrarTodosLosLibros();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
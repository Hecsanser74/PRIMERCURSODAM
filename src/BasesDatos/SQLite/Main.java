package BasesDatos.SQLite;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión - Biblioteca ===");
            System.out.println("1. Gestión de Libros");
            System.out.println("2. Gestión de Clientes");
            System.out.println("3. Gestión de Empleados");
            System.out.println("4. Gestión de Reservas");
            System.out.println("5. Creación de Tablas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n=== Menú de Gestión - Libros ===");
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
                            Biblioteca.añadirLibro();
                            break;
                        case 2:
                            Biblioteca.consultarLibroPorISBN();
                            break;
                        case 3:
                            Biblioteca.actualizarLibroPorISBN();
                        case 4:
                            Biblioteca.eliminarLibroPorISBN();
                            break;
                        case 5:
                            Biblioteca.mostrarTodosLosLibros();
                            break;
                        case 0:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente de nuevo.");
                    }
                    break;
                case 2:
                    Clientes.menuClientes();
                    break;
                case 3:
                    Empleados.menuEmpleados();
                    break;
                case 4:
                    Reservas.menuCReservas();
                    break;
                case 5:
                    System.out.println("\n=== Menú de Creación - Tablas ===");
                    System.out.println("1. Añadir la tabla Clientes");
                    System.out.println("2. Añadir la tabla Empleados");
                    System.out.println("3. Añadir la tabla Reservas");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            Clientes.crearTabla();
                            break;
                        case 2:
                            Empleados.crearTabla();
                            break;
                        case 3:
                            Reservas.crearTabla();
                            break;
                        default:
                            System.out.println("Opción no valida intentalo de nuevo.");
                    }
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
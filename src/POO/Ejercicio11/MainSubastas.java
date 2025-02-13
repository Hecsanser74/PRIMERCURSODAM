package POO.Ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSubastas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Subasta> subastas = new ArrayList<>();
        List<Pujador> pujadores = new ArrayList<>();

        System.out.println("Bienvenido al sistema de subastas.");

        while (true) {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Crear una nueva subasta");
            System.out.println("2. Añadir lotes a una subasta");
            System.out.println("3. Registrar pujadores");
            System.out.println("4. Escribir pujas de los pujadores");
            System.out.println("5. Cerrar subasta y ver resultados");
            System.out.println("6. Salir");
            System.out.print("Que opcion eliges: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Crear una nueva subasta
                    System.out.print("Escribe dia de la subasta (YYYY-MM-DD): ");
                    String diaSubasta = scanner.nextLine();
                    Subasta subasta = new Subasta(diaSubasta, null);
                    subastas.add(subasta);
                    System.out.println("Subasta creada el día: " +diaSubasta);
                    break;

                case 2:
                    // Añadir lotes a una subasta
                    if (subastas.isEmpty()) {
                        System.out.println("No hay subastas creadas.");
                        break;
                    }
                    System.out.println("A que subasta quieres añadir el lote:");
                    for (int i = 0; i < subastas.size(); i++) {
                        System.out.println((i + 1) + ". Subasta del día: " + subastas.get(i).getDiaSubasta());
                    }
                    int seleccionSubasta = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Escribe el número del lote: ");
                    int numeroLote = scanner.nextInt();
                    System.out.print("Escribe el precio de salida: ");
                    double precioSalida = scanner.nextDouble();
                    scanner.nextLine();

                    Lote lote = new Lote(numeroLote, precioSalida);

                    System.out.print("Escribe el nombre del articulo: ");
                    String nombreArticulo = scanner.nextLine();
                    System.out.print("Escribe su precio: ");
                    double precioArticulo = scanner.nextDouble();
                    scanner.nextLine();

                    lote.addArticulos(new Articulo(nombreArticulo, precioArticulo, lote));
                    subastas.get(seleccionSubasta).setLote(lote);
                    System.out.println("Lote añadido a la subasta.");
                    break;

                case 3:
                    // Registrar pujadores
                    System.out.print("Escribe el nombre del pujador: ");
                    String nombrePujador = scanner.nextLine();
                    Pujador pujador = new Pujador(nombrePujador);
                    pujadores.add(pujador);
                    System.out.println("Pujador registrado: " + nombrePujador);
                    break;

                case 4:
                    // Realizar pujas
                    if (subastas.isEmpty() || pujadores.isEmpty()) {
                        System.out.println("No hay subastas o pujadores registrados.");
                        break;
                    }
                    System.out.println("Selecciona la subasta para realizar pujas:");
                    for (int i = 0; i < subastas.size(); i++) {
                        System.out.println((i + 1) + ". Subasta del día: " + subastas.get(i).getDiaSubasta());
                    }
                    int seleccionSubastaPuja = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.println("Seleccione el pujador:");
                    for (int i = 0; i < pujadores.size(); i++) {
                        System.out.println((i + 1) + ". " + pujadores.get(i).getNombre());
                    }
                    int seleccionPujador = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Escribe la cantidad de la puja: ");
                    double cantidadPuja = scanner.nextDouble();
                    scanner.nextLine();

                    Puja puja = new Puja(pujadores.get(seleccionPujador), subastas.get(seleccionSubastaPuja).getLote(), cantidadPuja);
                    subastas.get(seleccionSubastaPuja).getLote().añadirPuja(puja);
                    System.out.println("Puja realizada.");
                    break;

                case 5:
                    // Cerrar subasta y ver resultados
                    if (subastas.isEmpty()) {
                        System.out.println("No hay subastas creadas.");
                        break;
                    }
                    System.out.println("Selecciona la subasta que quieres cerrar:");
                    for (int i = 0; i < subastas.size(); i++) {
                        System.out.println((i + 1) + ". Subasta del día: " + subastas.get(i).getDiaSubasta());
                    }
                    int seleccionCerrar = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer

                    subastas.get(seleccionCerrar).cerrarSubasta();
                    break;

                case 6:
                    // Salir
                    System.out.println("Cerrando sistema de subastas...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
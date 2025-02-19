package POO.Herencias.Network;

import POO.Herencias.Network.PubFotograficas;
import POO.Herencias.Network.PubTexto;
import POO.Herencias.Network.Publicacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Publicacion> publicaciones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Crear publicación de texto");
            System.out.println("2. Crear publicación fotográfica");
            System.out.println("3. Mostrar todas las publicaciones");
            System.out.println("4. Buscar publicaciones por autor");
            System.out.println("5. Dar 'me gusta' a una publicación");
            System.out.println("6. Escribir comentario a una publicación");
            System.out.println("7. Eliminar publicación");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearPublicacionTexto();
                    break;
                case 2:
                    crearPublicacionFoto();
                    break;
                case 3:
                    mostrarTodasLasPublicaciones();
                    break;
                case 4:
                    buscarPublicacionesPorAutor();
                    break;
                case 5:
                    darMeGusta();
                    break;
                case 6:
                    agregarComentario();
                    break;
                case 7:
                    eliminarPublicacion();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void crearPublicacionTexto() {
        System.out.print("Ingresa el nombre del autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingresa el mensaje: ");
        String mensaje = scanner.nextLine();

        PubTexto pubTexto = new PubTexto(autor, mensaje);
        publicaciones.add(pubTexto);
        System.out.println("Publicación de texto creada con éxito.");
    }

    private static void crearPublicacionFoto() {
        System.out.print("Ingresa el nombre del autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingresa el nombre del archivo de imagen: ");
        String nombreArchivo = scanner.nextLine();
        System.out.print("Ingresa el título de la foto: ");
        String titulo = scanner.nextLine();

        PubFotograficas pubFoto = new PubFotograficas(autor, nombreArchivo, titulo);
        publicaciones.add(pubFoto);
        System.out.println("Publicación fotográfica creada con éxito.");
    }

    private static void mostrarTodasLasPublicaciones() {
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones.");
        } else {
            System.out.println("\n=== Todas las publicaciones ===");
            for (Publicacion pub : publicaciones) {
                pub.mostrar();
                System.out.println();
            }
        }
    }

    private static void buscarPublicacionesPorAutor() {
        System.out.print("Ingresa el nombre del autor: ");
        String autor = scanner.nextLine();

        System.out.println("\n=== Publicaciones de " + autor + " ===");
        boolean encontradas = false;
        for (Publicacion pub : publicaciones) {
            if (pub.getAutor().equalsIgnoreCase(autor)) {
                pub.mostrar();
                System.out.println();
                encontradas = true;
            }
        }
        if (!encontradas) {
            System.out.println("No hay publicaciones para el autor " + autor);
        }
    }

    private static void darMeGusta() {
        System.out.print("Ingresa el ID de la publicación a la que desea dar 'me gusta': ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Publicacion publicacion = buscarPublicacionPorId(id);
        if (publicacion != null) {
            publicacion.darMeGusta();
            System.out.println("¡Me gusta agregado a la publicación " + id + "!");
        } else {
            System.out.println("No hay una publicación con el ID " + id);
        }
    }

    private static void agregarComentario() {
        System.out.print("Ingresa el ID de la publicación a la que quieres agregar un comentario: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Publicacion publicacion = buscarPublicacionPorId(id);
        if (publicacion != null) {
            System.out.print("Ingresa su nombre: ");
            String autorComentario = scanner.nextLine();
            System.out.print("Ingresa el comentario: ");
            String comentario = scanner.nextLine();

            publicacion.agregarComentario(autorComentario + ": " + comentario);
            System.out.println("Comentario agregado a la publicación " + id + ".");
        } else {
            System.out.println("No hay una publicación con el ID " + id);
        }
    }

    private static void eliminarPublicacion() {
        System.out.print("Ingresa el ID de la publicación a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Publicacion publicacionAEliminar = buscarPublicacionPorId(id);
        if (publicacionAEliminar != null) {
            publicaciones.remove(publicacionAEliminar);
            System.out.println("Publicación eliminada con éxito.");
        } else {
            System.out.println("No hay una publicación con el ID " + id);
        }
    }

    private static Publicacion buscarPublicacionPorId(int id) {
        for (Publicacion pub : publicaciones) {
            if (pub.getId() == id) {
                return pub;
            }
        }
        return null;
    }
}
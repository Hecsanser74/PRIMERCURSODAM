package POO.Herencias.Network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunas publicaciones
        PubTexto pubTexto1 = new PubTexto("Juan", "Hoy es un gran día para aprender Java.");
        PubTexto pubTexto2 = new PubTexto("Ana", "¡Acabo de terminar mi primer proyecto en Java!");
        PubFotograficas pubFoto1 = new PubFotograficas("Carlos", "foto1.jpg", "Atardecer en la playa");
        PubFotograficas pubFoto2 = new PubFotograficas("Ana", "foto2.jpg", "Mi nueva mascota");

        // Dar "me gusta" a algunas publicaciones
        pubTexto1.darMeGusta();
        pubTexto1.darMeGusta();
        pubFoto1.darMeGusta();
        pubFoto2.darMeGusta();
        pubFoto2.darMeGusta();
        pubFoto2.darMeGusta();

        // Mostrar todas las publicaciones
        System.out.println("=== Todas las publicaciones ===");
        List<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(pubTexto1);
        publicaciones.add(pubTexto2);
        publicaciones.add(pubFoto1);
        publicaciones.add(pubFoto2);

        for (Publicacion pub : publicaciones) {
            pub.mostrar();
            System.out.println(); // Separador entre publicaciones
        }

        // Buscar publicaciones de un autor específico
        String autorBuscado = "Ana";
        System.out.println("=== Publicaciones de " + autorBuscado + " ===");
        for (Publicacion pub : publicaciones) {
            if (pub.getAutor().equals(autorBuscado)) {
                pub.mostrar();
                System.out.println(); // Separador entre publicaciones
            }
        }

        // Mostrar la publicación con más "me gusta"
        System.out.println("=== Publicación más popular ===");
        Publicacion publicacionMasPopular = publicaciones.get(0);
        for (Publicacion pub : publicaciones) {
            if (pub.getMeGusta() > publicacionMasPopular.getMeGusta()) {
                publicacionMasPopular = pub;
            }
        }
        publicacionMasPopular.mostrar();
    }
}

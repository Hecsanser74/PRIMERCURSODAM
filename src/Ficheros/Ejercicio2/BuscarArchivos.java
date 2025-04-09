package Ficheros.Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class BuscarArchivos {
    public static void buscar(File directorioActual, Scanner sc){

        File[] contenido = directorioActual.listFiles();

        if (contenido == null) {
            System.out.println("No hay contenido accesible en este directorio.");
        }

        System.out.println("Introduce el archivo que quieres buscar: ");
        String nombreArchivo = sc.nextLine();

        for (int i = 0; i < contenido.length; i++) {
            if (contenido[i].getName().equals(nombreArchivo) && contenido[i].exists()) {
                System.out.println("Archivo encontrado: " +contenido[i].getAbsolutePath());
            }
        }
    }
}

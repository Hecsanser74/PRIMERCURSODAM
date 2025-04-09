package Ficheros.Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class ContarPorExtension {
    public static void contar(File directorioActual, Scanner sc){

        File[] contenido = directorioActual.listFiles();

        if (contenido == null) {
            System.out.println("No hay contenido accesible en este directorio.");
        }

        int contenidoExtension = 0;

        System.out.println("Escribe que excepcion quieres contar: ");
        String extension = sc.nextLine();

        for (int i = 0; i < contenido.length; i++) {
            if (contenido[i].getName().endsWith(extension)){
                contenidoExtension++;
            }
        }
        System.out.println("De la extension ."+extension+" hay "+contenidoExtension+" archivos.");
    }
}
package Ficheros.Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class EliminarDirectorio {
    public static void eliminar(File directorioActual, Scanner sc){
        System.out.print("¿Qué directorio quieres eliminar? ");
        String dir = sc.nextLine();

        File dirEliminar = new File(directorioActual, dir);

        if (!dirEliminar.exists()) {
            System.out.println("El directorio '" + dir + "' no existe.");
        } else if (!dirEliminar.isDirectory()) {
            System.out.println("'" + dir + "' no es un directorio.");
        } else if (dirEliminar.list().length > 0) {
            System.out.println("El directorio no está vacío. No se puede eliminar.");
        } else if (dirEliminar.delete()) {
            System.out.println("El directorio '" + dir + "' ha sido eliminado.");
        } else {
            System.out.println("No se pudo eliminar el directorio.");
        }
    }
}

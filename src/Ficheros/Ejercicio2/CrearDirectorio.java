package Ficheros.Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class CrearDirectorio {
    public static void crear(File directorioActual, Scanner sc){
        System.out.print("¿Qué nombre quieres ponerle al nuevo directorio? ");
        String dir = sc.nextLine();

        File nuevoDir = new File(directorioActual, dir);

        if (nuevoDir.exists()) {
            System.out.println("El directorio '" + dir + "' ya existe.");
        } else if (nuevoDir.mkdir()) {
            System.out.println("El directorio '" + dir + "' se ha creado con éxito.");
        } else {
            System.out.println("El directorio no se ha podido crear.");
        }
    }
}

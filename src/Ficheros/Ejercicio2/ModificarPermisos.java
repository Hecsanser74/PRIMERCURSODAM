package Ficheros.Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class ModificarPermisos {
    public static void cambiarPermisos(File directorioActual, Scanner sc){
        //Contenido del directorio
        File[] contenido = directorioActual.listFiles();

        if (contenido == null || contenido.length == 0) {
            System.out.println("No se puede acceder al contenido de este directorio.");
            return;
        }

        //Archivos y directorios
        System.out.println("Archivos en el directorio actual:");
        for (int i = 0; i < contenido.length; i++) {
            System.out.println((i + 1) + ". " + contenido[i].getName());
        }

        //Pedir al usuario que elija un archivo o directorio para cambiar permisos
        System.out.print("Introduce el número del archivo o directorio al que quieras cambiar permisos: ");
        int opcion = sc.nextInt();
        sc.nextLine();  // Limpiar el buffer

        //Validar la opción seleccionada
        if (opcion < 1 || opcion > contenido.length) {
            System.out.println("Opción no válida.");
            return;
        }

        //Solicitar al usuario qué acción realizar (dar o quitar permisos)
        System.out.println("Para dar permisos pulsa (d), para quitar pulsa (q): ");
        String permisosMod = sc.nextLine().toLowerCase();

        //Cambiar los permisos según la opción seleccionada
        if (permisosMod.equals("d")) {
            contenido[opcion - 1].setReadable(true);
            contenido[opcion - 1].setWritable(true);
            contenido[opcion - 1].setExecutable(true);
            System.out.println("Los permisos se han dado correctamente.");
        } else if (permisosMod.equals("q")) {
            contenido[opcion - 1].setReadable(false);
            contenido[opcion - 1].setWritable(false);
            contenido[opcion - 1].setExecutable(false);
            System.out.println("Los permisos se han quitado correctamente.");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
package Ficheros.Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws IOException {
        File directorioActual = File.listRoots()[0];
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("===UNIDAD PRINCIPAL DEL SISTEMA DE ARCHIVOS===");
            System.out.println("----------------------------------------------");

            //Mostrar el directorio actual
            System.out.println("Directorio que esta mostrando: "+ directorioActual.getAbsolutePath());

            //Opcion 0: Ir directorio padre, si existe
            if (directorioActual.getParent() != null){
                System.out.println("0. Ir al directorio padre.");
            } else {
                System.out.println("0. [RAIZ DEL SISTEMA]");
            }

            //Mostrar archivos, directorios y sus propiedades
            File[] contenido = directorioActual.listFiles();

            if (contenido != null) {
                for (int i = 0; i < contenido.length; i++) {
                    if (contenido[i].isDirectory()) {
                        System.out.println((i + 1) + ". " + contenido[i].getName() + " (Directorio)");
                    } else {
                        System.out.println((i + 1) + ". " + contenido[i].getName() + " (" + contenido[i].length() + " bytes)");
                    }
                }
            } else {
                System.out.println("No se puede acceder al contenido de este directorio.");
            }

            //Solicitar opción
            System.out.println("-----------------------------------");
            System.out.print("Introduce una opción (-1 para salir): ");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion == -1) {
                    System.out.println("Saliendo del programa...");
                } else if (opcion == 0) {

                    //Ir al directorio padre
                    File padre = directorioActual.getParentFile();
                    if (padre != null) {
                        directorioActual = padre;
                    } else {
                        System.out.println("Este directorio no tiene padre.");
                    }
                } else if (contenido != null && opcion > 0 && opcion <= contenido.length) {

                    //Comprobacion
                    File seleccionado = contenido[opcion - 1];
                    if (seleccionado.isDirectory() && seleccionado.canRead()) {
                        directorioActual = seleccionado;
                    } else if (seleccionado.isDirectory()) {
                        System.out.println("Acceso denegado al directorio.");
                    }
                } else {
                    System.out.println("Opción no válida.");
                }
        } while (opcion != -1);

        sc.close();
    }
}

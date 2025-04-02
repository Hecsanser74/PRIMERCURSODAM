package Ficheros.Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {
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

            DateFormat formatter;
            formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

            //Mostrar archivos, directorios y sus propiedades
            File[] contenido = directorioActual.listFiles();

            if (contenido != null) {
                for (int i = 0; i < contenido.length; i++) {
                    System.out.print((i + 1 + ". "));

                    if (contenido[i].isDirectory()) {
                        System.out.print("\td");
                    } else {
                        System.out.print("\t");
                    }
                    if (contenido[i].canRead()) {
                        System.out.print("r");
                    } else {
                        System.out.print("-");
                    }
                    if (contenido[i].canWrite()){
                        System.out.print("w");
                    } else {
                        System.out.print("-");
                    }
                    if (contenido[i].canExecute()){
                        System.out.print("x");
                    } else {
                        System.out.print("-");
                    }

                    System.out.println("\t" + contenido[i].length() + "\t" + formatter.format(contenido[i].lastModified()) + "\t" + contenido[i].getName());
                }
            } else {
                System.out.println("No se puede acceder al contenido de este directorio.");
            }

            if (opcion != -2){
            //Solicitar opción
            System.out.println("-----------------------------------");
            System.out.print("Introduce una opción (-1 para salir, -2 cambio de permisos): ");
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
            } else {
                System.out.println("Introduce el numero del que quieras cambiar permisos: ");
                opcion = sc.nextInt();
                sc.nextLine();

                System.out.println("Para dar permisos pulsa (d) para quitar pulsa (q): ");
                String permisosMod = sc.nextLine();

                if (permisosMod.equals("d")){
                    contenido[opcion -1].setReadable(true);
                    contenido[opcion -1].setExecutable(true);
                    contenido[opcion -1].setWritable(true);
                } else if (permisosMod.equals("q")) {
                    contenido[opcion -1].setReadable(false);
                    contenido[opcion -1].setExecutable(false);
                    contenido[opcion -1].setWritable(false);
                }
            }
        } while (opcion != -1);

        sc.close();
    }
}
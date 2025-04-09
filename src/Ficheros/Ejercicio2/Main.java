package Ficheros.Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File directorioActual = File.listRoots()[0];
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("===UNIDAD PRINCIPAL DEL SISTEMA DE ARCHIVOS===");
            System.out.println("----------------------------------------------");

            //Mostrar el directorio actual
            System.out.println("Directorio que esta mostrando: "+ directorioActual.getAbsolutePath());

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

            System.out.println("0. Ir al directorio padre.");
            System.out.println("-1. Salir del programa.");
            System.out.println("-2. Modificar permisos.");
            System.out.println("-3. Contar por extensión.");
            System.out.println("-4. Buscar archivos.");
            System.out.println("-5. Crear directorio.");
            System.out.println("-6. Eliminar directorio.");
            System.out.print("Introduce una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case -1:
                    SalirPrograma.salir();
                    break;
                case 0:
                    directorioActual = IrDirectorioPadre.navegar(directorioActual, opcion);
                    break;
                case -2:
                    ModificarPermisos.cambiarPermisos(directorioActual, sc);
                    break;
                case -3:
                    ContarPorExtension.contar(directorioActual, sc);
                    break;
                case -4:
                    BuscarArchivos.buscar(directorioActual, sc);
                    break;
                case -5:
                    CrearDirectorio.crear(directorioActual, sc);
                    break;
                case -6:
                    EliminarDirectorio.eliminar(directorioActual, sc);
                    break;
                default:
                    if (opcion > 0) {
                        directorioActual = navegarASubdirectorio(directorioActual, opcion);
                    } else {
                        System.out.println("Opción no válida.");
                    }
            }
        } while (opcion != -1);

        sc.close();
    }

    private static File navegarASubdirectorio(File directorioActual, int opcion) {
        File[] contenido = directorioActual.listFiles();
        if (contenido != null && opcion <= contenido.length) {
            File seleccionado = contenido[opcion - 1];
            if (seleccionado.isDirectory() && seleccionado.canRead()) {
                return seleccionado;
            }
        }
        System.out.println("No se puede acceder.");
        return directorioActual;
    }
}
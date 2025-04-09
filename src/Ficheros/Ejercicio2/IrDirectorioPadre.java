package Ficheros.Ejercicio2;

import java.io.File;

public class IrDirectorioPadre {

    public static File navegar(File directorioActual, int opcion) {
        if (opcion == 0) {
            File directorioPadre = directorioActual.getParentFile();
            if (directorioPadre != null) {
                return directorioPadre;
            } else {
                System.out.println("Ya estás en el directorio raíz.");
                return directorioActual;
            }
        } else {
            File[] contenido = directorioActual.listFiles();
            if (contenido != null && opcion > 0 && opcion <= contenido.length) {
                File seleccionado = contenido[opcion - 1];
                if (seleccionado.isDirectory() && seleccionado.canRead()) {
                    return seleccionado;
                } else if (seleccionado.isDirectory()) {
                    System.out.println("Acceso denegado al directorio.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }

        return directorioActual;
    }
}

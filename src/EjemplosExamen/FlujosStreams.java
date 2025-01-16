package EjemplosExamen;

import java.util.ArrayList;

public class FlujosStreams {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();

        numeros.add("25");
        numeros.add("30");
        numeros.add("20");

        // Contamos los múltiples de 3
        long cuantos = numeros.stream()
                //convertimos a Int
                .mapToInt(s -> Integer.valueOf(s))
                //filtramos los que sean múltiplos de 3
                .filter(number -> number % 3 == 0)
                //y los contamos
                .count();

        // la media
        double media = numeros.stream()
                //Convertimos a int
                .mapToInt(s -> Integer.valueOf(s))
                //sacamos la media
                .average()
                //devolvemos el valor como double
                .getAsDouble();

        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, media );

    }
}

//Puedes filtrar, mapear o reducir datos de manera compacta.

package EjemplosExamen;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        // Añadir elementos
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Pedro", 28);

        // Obtener valor por clave
        System.out.println("Edad de Juan: " + edades.get("Juan")); // 25

        // Mostrar todas las claves y valores
        System.out.println(edades); // {Juan=25, Ana=30, Pedro=28}
    }
}

//almacena pares de clave-valor. Es útil cuando quieres asociar una clave con un valor

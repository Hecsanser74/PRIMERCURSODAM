package EjemplosEstBasicas;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> notas = new LinkedHashMap<>();

        notas.put("Matemáticas", 85);
        notas.put("Historia", 90);
        notas.put("Ciencias", 95);

        System.out.println(notas); // {Matemáticas=85, Historia=90, Ciencias=95}
    }
}


//Es como un HashMap, pero recuerda el orden en el que se añadieron las claves.

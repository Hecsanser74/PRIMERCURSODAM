package EjemplosEstBasicas;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer> puntuaciones = new TreeMap<>();

        puntuaciones.put("Carlos", 70);
        puntuaciones.put("Ana", 90);
        puntuaciones.put("Juan", 80);

        System.out.println(puntuaciones); // {Ana=90, Carlos=70, Juan=80}
    }
}

//es como un HashMap, pero ordena automáticamente las claves en orden natural (alfabético o numérico).
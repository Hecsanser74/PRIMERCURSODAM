package EjemplosEstBasicas;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Ana"); // Este no se añade porque ya existe

        System.out.println(nombres); // [Ana, Carlos] (sin orden garantizado)
    }
}


//es una colección que no permite duplicados. No tiene orden específico.

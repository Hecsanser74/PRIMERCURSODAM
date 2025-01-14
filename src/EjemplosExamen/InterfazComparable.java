package EjemplosExamen;

import java.util.ArrayList;
import java.util.Collections;

class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return this.edad - otra.edad; // Ordenar por edad
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

public class InterfazComparable {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 30));
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Carlos", 35));

        Collections.sort(personas);
        System.out.println(personas); // [Ana (25), Juan (30), Carlos (35)]
    }
}

//La interfaz Comparable se usa para definir cómo se deben comparar objetos de una clase. Esto es útil para ordenar.

package Flujos_Streams;

import java.util.ArrayList;

public class Person2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        personas.add(new Person("Juan", "Antonio", 1956));
        personas.add(new Person("Maria", "Juana", 1945));
        personas.add(new Person("Anna", "Rejano", 2005));
        personas.add(new Person("Christian", "Artin", 1989));
        personas.add(new Person("Lionel", "Messi", 1984));

        String apellidoporA = String.valueOf(personas.stream()
                .filter(lastName -> lastName.getLastName().charAt(0) == 'A')
                .count());

        System.out.println("Las personas que su apellido empieza por A son: "+apellidoporA);
    }
}

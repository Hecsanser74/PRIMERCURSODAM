package Flujos_Streams;

import java.util.ArrayList;

public class Person1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        personas.add(new Person("Juan", "Antonio", 1956));
        personas.add(new Person("Maria", "Juana", 1945));
        personas.add(new Person("Anna", "Rejano", 2005));
        personas.add(new Person("Christian", "Martin", 1989));
        personas.add(new Person("Lionel", "Messi", 1984));

        long cuantosAntes = personas.stream()
                .mapToInt(s -> Integer.valueOf(s.getBirthYear()))
                .filter(numero -> numero < 1970)
                .count();

        System.out.println("Las personas que han nacido antes de 1970 son estas: "+cuantosAntes);
    }
}

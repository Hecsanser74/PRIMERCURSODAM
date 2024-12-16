package Flujos_Streams;

import java.util.ArrayList;

public class Person2 {
    public static void main(String[] args) {
        ArrayList<Person2> personas = new ArrayList<>();

        personas.add(new Person2("Juan", "Ramirez", 1949));
        personas.add(new Person2("Pau", "Moreno", 1950));
        personas.add(new Person2("Hector", "Sancho", 2004));
        personas.add(new Person2("Carlos", "Andrei", 1976));

        long cuantosAntes = personas.stream()
                .filter(lastName -> lastName.getLastName().charAt(0) == 'A')
                .count();

        System.out.println("Las personas que su apellido empieza por A son: " +cuantosAntes);

    }
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person2(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public int getBirthYear () {
        return this.birthYear;
    }
}

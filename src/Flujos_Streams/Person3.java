package Flujos_Streams;

import java.util.ArrayList;

public class Person3 {
    public static void main(String[] args) {
        ArrayList<Person3> personas = new ArrayList<>();


        personas.add(new Person3("Pau", "Ramirez", 1949));
        personas.add(new Person3("Pau", "Moreno", 1950));
        personas.add(new Person3("Hector", "Sancho", 2004));
        personas.add(new Person3("Carlos", "Andrei", 1976));

       // List<String> nombres = personas.stream()
              //  .filter(s -> s.getFirstName() != "Lucas")
               // .forEach(s -> System.out.println(s))
                //.collect(Collectors.toList());

        System.out.println("Las personas que han nacido antes de 1970 son: ");

    }
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person3(String firstName, String lastName, int birthYear){
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

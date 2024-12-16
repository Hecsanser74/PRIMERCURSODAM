package Flujos_Streams;

import java.util.ArrayList;

public class Person {
        public static void main(String[] args) {
            ArrayList<Person> personas = new ArrayList<>();

            personas.add(new Person("Juan", "Ramirez", 1949));
            personas.add(new Person("Pau", "Moreno", 1950));
            personas.add(new Person("Hector", "Sancho", 2004));
            personas.add(new Person("Carlos", "Andrei", 1976));

            long cuantosAntes = personas.stream()
                    .mapToInt(s -> Integer.valueOf(s.getBirthYear()))
                    .filter(number -> number < 1970)
                    .count();

            System.out.println("Las personas que han nacido antes de 1970 son: " +cuantosAntes);

        }
            private String firstName;
            private String lastName;
            private int birthYear;

        public Person(String firstName, String lastName, int birthYear){
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


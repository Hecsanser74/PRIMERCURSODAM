package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear áreas de conocimiento
        Area_Coneixement area1 = new Area_Coneixement("Química");
        Area_Coneixement area2 = new Area_Coneixement("Física");

        // Crear departamentos
        Departament dep1 = new Departament("Departamento de Investigación y Desarrollo (I+D)", area1);
        Departament dep2 = new Departament("Departamento de Educación Física", area2);

        // Añadir departamentos a las áreas de conocimiento
        area1.addDepartament(dep1);
        area2.addDepartament(dep2);

        // Crear facultades
        Facultad fac1 = new Facultad("Facultad de Ciencias");
        Facultad fac2 = new Facultad("Facultad de Humanidades");

        // Crear cátedras
        Catedra cat1 = new Catedra("Cátedra de Biología Molecular", dep1, fac1);
        Catedra cat2 = new Catedra("Cátedra de Genética", dep2, fac2);

        // Añadir cátedras a los departamentos
        dep1.addCatedra(cat1);
        dep2.addCatedra(cat2);

        // Añadir cátedras a las facultades
        fac1.addCatedra(cat1);
        fac2.addCatedra(cat2);

        // Crear profesores
        Profesor prof1 = new Profesor("12345678A", dep1);
        Profesor prof2 = new Profesor("87654321B", dep2);

        // Añadir profesores a los departamentos
        dep1.addProfesor(prof1);
        dep2.addProfesor(prof2);

        // Añadir cátedras a los profesores
        prof1.addCatedra(cat1);
        prof2.addCatedra(cat2);

        // Crear adscripciones
        Adscrit adscrit1 = new Adscrit("01-05-2021", prof1, cat1);
        Adscrit adscrit2 = new Adscrit("05-16-2015", prof2, cat2);

        // Mostrar información
        System.out.println("Profesor 1: " + prof1.getDNI() + " pertenece al departamento " + prof1.getDepartament().getCod_Depa());
        System.out.println("Profesor 2: " + prof2.getDNI() + " pertenece al departamento " + prof2.getDepartament().getCod_Depa());

        System.out.println("Cátedra 1: " + cat1.getCod_Catedra() + " pertenece a la facultad " + cat1.getFacultad().getCod_Facu());
        System.out.println("Cátedra 2: " + cat2.getCod_Catedra() + " pertenece a la facultad " + cat2.getFacultad().getCod_Facu());

        System.out.println("Adscripción 1: Profesor " + adscrit1.getProfesor().getDNI() + " está adscrito a la cátedra " + adscrit1.getCatedra().getCod_Catedra() + " desde " + adscrit1.getData());
        System.out.println("Adscripción 2: Profesor " + adscrit2.getProfesor().getDNI() + " está adscrito a la cátedra " + adscrit2.getCatedra().getCod_Catedra() + " desde " + adscrit2.getData());
    }
}

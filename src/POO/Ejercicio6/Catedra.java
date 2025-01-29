package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {

    private String cod_Catedra; //Idetificador para Catedra
    private Departament departament; //Relacion con Departament
    private Facultad facultad; //Relacion con Facultad
    private Set<Profesor> profesorSet; //Relacion con Profesor

    //Getters
    public Departament getDepartament() {
        return departament;
    }

    public String getCod_Catedra() {
        return cod_Catedra;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Set<Profesor> getProfesorSet() {
        return profesorSet;
    }

    //Setters
    public void setCod_Catedra(String cod_Catedra) {
        this.cod_Catedra = cod_Catedra;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public void addProfesor (Profesor profesor){
        this.profesorSet.add(profesor);
    }

    //Constructor
    public Catedra (String cod_Catedra, Departament departament, Facultad facultad){
        this.cod_Catedra = cod_Catedra;
        this.departament = departament;
        this.facultad = facultad;
        this.profesorSet = new HashSet<>();
    }
}

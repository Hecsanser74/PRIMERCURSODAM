package POO.ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departament {

    private String cod_Depa; //Identificador de Departamento
    private Area_Coneixement areaConeixement;  //Relacion con Area_Coneixement
    private Set<Profesor> profesorSet; //Relacion con Profesor
    private Set<Catedra> catedraSet; //Relacion con Catedra

    //Getters
    public String getCod_Depa() {
        return cod_Depa;
    }

    public Set<Profesor> getProfesorSet() {
        return profesorSet;
    }

    public Area_Coneixement getAreaConeixement() {
        return areaConeixement;
    }

    public Set<Catedra> getCatedraSet() {
        return catedraSet;
    }

    //Setters
    public void setCod_Depa(String cod_Depa) {
        this.cod_Depa = cod_Depa;
    }

    public void setAreaConeixement(Area_Coneixement areaConeixement) {
        this.areaConeixement = areaConeixement;
    }

    public void addProfesor (Profesor profesor) {
        this.profesorSet.add(profesor);
    }

    public void addCatedra (Catedra catedra){
        this.catedraSet.add(catedra);
    }


    //Contructor
    public Departament (String cod_Depa, Area_Coneixement areaConeixement){
        this.cod_Depa = cod_Depa;
        this.areaConeixement = areaConeixement;
        this.profesorSet = new HashSet<>();
        this.catedraSet = new HashSet<>();
    }
}

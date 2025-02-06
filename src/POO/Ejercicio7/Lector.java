package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String DNI; //Identificador de Lector
    private Set<Exemplar> exemplarSetPrestec; //Relacion con Exemplar Prestec
    private Set<Exemplar> exemplarSetHistoric; //Relacion con Exemplar Historic

    //Getters
    public String getDNI() {
        return DNI;
    }

    public Set<Exemplar> getExemplarSetHistoric() {
        return exemplarSetHistoric;
    }

    public Set<Exemplar> getExemplarSetPrestec() {
        return exemplarSetPrestec;
    }

    //Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void addExemplarHistoric (Exemplar exemplar){
        this.exemplarSetHistoric.add(exemplar);
    }

    public void addExemplarPrestec (Exemplar exemplar){
        this.exemplarSetPrestec.add(exemplar);
    }


    //Constructor
    public Lector (String DNI){
        this.DNI = DNI;
        this.exemplarSetHistoric = new HashSet<>();
        this.exemplarSetPrestec = new HashSet<>();
    }
}

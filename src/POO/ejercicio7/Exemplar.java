package POO.ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Exemplar {
    private String n_red; //Identificador de Exemplar
    private Llibre llibre; //Relacion con Llibre
    private Lector lector; //Relacion con Lector
    private Set<Lector> lectorSet; //Relacion con Lector M:N

    //Getters
    public Lector getLector() {
        return lector;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public Set<Lector> getLectorSet() {
        return lectorSet;
    }

    public String getN_red() {
        return n_red;
    }

    //Setters
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public void setN_red(String n_red) {
        this.n_red = n_red;
    }

    private void addLector (Lector lector){
        this.lectorSet.add(lector);
    }

    //Constructor
    public Exemplar (String n_red, Llibre llibre, Lector lector){
        this.lector = lector;
        this.llibre = llibre;
        this.n_red = n_red;
        this.lectorSet = new HashSet<>();
    }
}

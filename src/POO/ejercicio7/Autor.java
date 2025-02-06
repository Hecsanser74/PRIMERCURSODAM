package POO.ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {

    private String cod_aut; //Identificador de Autor
    private Set<Llibre> llibreSet; //Relacion con Llibre

    //Getters
    public Set<Llibre> getLlibreSet() {
        return llibreSet;
    }

    public String getCod_aut() {
        return cod_aut;
    }

    //Setters
    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
    }

    public void addLlibre (Llibre llibre){
        this.llibreSet.add(llibre);
    }

    //Constructor
    public Autor (String cod_aut){
        this.cod_aut = cod_aut;
        this.llibreSet = new HashSet<>();
    }
}

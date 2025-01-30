package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String codTema; //Identificador de Tema
    private Set<Llibre>llibreSet; //Relacion con LLibre

    //Getters
    public String getCodTema() {
        return codTema;
    }

    public Set<Llibre> getLlibreSet() {
        return llibreSet;
    }

    //Setters
    public void setCodTema(String codTema) {
        this.codTema = codTema;
    }

    private void addLlibre (Llibre llibre){
        this.llibreSet.add(llibre);
    }

    public Tema(String codTema) {
        this.codTema = codTema;
        this.llibreSet = new HashSet<>();
    }
}

package POO.Ejercicio11;

import java.util.Set;

public class Pujador {
    private String nombre;
    private Set<Lote>lotes;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addLote (Lote lote){
        this.lotes.add(lote);
    }

    //Constructor
    public Pujador(String nombre){
        this.nombre = nombre;
    }
}

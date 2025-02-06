package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String cod_ed; //Identificador de Editorial
    private Set<Llibre> llibreSet; //Relacion con Llibre

    //Getters
    public Set<Llibre> getLlibreSet() {
        return llibreSet;
    }

    public String getCod_ed() {
        return cod_ed;
    }

    //Setters
    public void setCod_ed(String cod_ed) {
        this.cod_ed = cod_ed;
    }

    private void addLlibre (Llibre llibre){
        this.llibreSet.add(llibre);
    }


    //Constructor
    public Editorial (String cod_ed){
        this.cod_ed = cod_ed;
        this.llibreSet = new HashSet<>();
    }

}

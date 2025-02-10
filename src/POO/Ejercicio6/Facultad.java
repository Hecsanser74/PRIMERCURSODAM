package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultad {

    private String cod_Facu; //Identificador Facultad
    private Set<Catedra> catedraSet; //Relacion con Catedra

    //Getters
    public Set<Catedra> getCatedraSet() {
        return catedraSet;
    }

    public String getCod_Facu() {
        return cod_Facu;
    }

    //Setters
    public void setCod_Facu(String cod_Facu) {
        this.cod_Facu = cod_Facu;
    }

    public void addCatedra (Catedra catedra) {
        this.catedraSet.add(catedra);
    }

    //Constructor
    public Facultad (String cod_Facu) {
        this.cod_Facu = cod_Facu;
        this.catedraSet = new HashSet<>();
    }
}

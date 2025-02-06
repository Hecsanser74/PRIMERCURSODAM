package POO.ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Area_Coneixement {

    private String cod_Area; //ID Area
    private Set<Departament> departaments; //Relacion con Departament

    //Getters
    public Set<Departament> getDepartaments() {
        return departaments;
    }

    public String getCod_Area() {
        return cod_Area;
    }

    //Setters
    public void setCod_Area(String cod_Area) {
        this.cod_Area = cod_Area;
    }

    public void addDepartament (Departament departamentPara) {
        this.departaments.add(departamentPara);
    }

    //Constructor
    public Area_Coneixement(String cod_Area){
        this.cod_Area = cod_Area;
        this.departaments = new HashSet<>();

    }
}

package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Profesor {

    private String DNI; //Identif Prof
    private Departament departament; //Relacion con Departament
    private Set<Catedra> catedraSet; //Relacion con Catedra

    //Getters
    public String getDNI() {
        return DNI;
    }

    public Departament getDepartament() {
        return departament;
    }

    public Set<Catedra> getCatedraSet() {
        return catedraSet;
    }

    //Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void addCatedra (Catedra catedra){
        this.catedraSet.add(catedra);
    }

    //Constructor
    public Profesor (String DNI, Departament departament){
        this.DNI = DNI;
        this.departament = departament;
        this.catedraSet = new HashSet<>();
    }
}

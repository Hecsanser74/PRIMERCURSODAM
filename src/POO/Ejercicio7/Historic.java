package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Historic {
    private String data_p; //Identificador de Historic
    private String data_t; //Identificador de Historic
    private Lector lector; //Relacion con Lector
    private Exemplar exemplar; //Relacion con Exemplar

    //Getters
    public Exemplar getExemplar() {
        return exemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public String getData_p() {
        return data_p;
    }

    public String getData_t() {
        return data_t;
    }

    //Setters
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public void setData_t(String data_t) {
        this.data_t = data_t;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    //Constructor
    public Historic (String data_p, String data_t, Lector lector, Exemplar exemplar){
        this.lector = lector;
        this.data_p = data_p;
        this.data_t = data_t;
        this.exemplar = exemplar;

    }
}

package POO.Ejercicio7;

import java.util.Set;

public class Prestec {
    private String data_p; //Identificador de Prestec
    private Lector lector; //Relacion con Lector
    private Exemplar exemplar; //Relacion con Exemplar

    //Getters
    public String getData_p() {
        return data_p;
    }

    public Lector getLector() {
        return lector;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    //Setters
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    //Constructor
    public Prestec (String data_p, Lector lector, Exemplar exemplar){
        this.data_p = data_p;
        this.exemplar = exemplar;
        this.lector = lector;
    }
}

package POO.Ejercicio6;

public class Adscrit {
    private String data; //Atributo de la tabla
    private  Profesor profesor; //Relacion con Profesor
    private Catedra catedra; //Relacion con Catedra

    //Getters
    public Catedra getCatedra() {
        return catedra;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getData() {
        return data;
    }

    //Setters
    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    //Constructor
    public Adscrit (String data, Profesor profesor, Catedra catedra){
        this.catedra = catedra;
        this.data = data;
        this.profesor = profesor;
    }
}

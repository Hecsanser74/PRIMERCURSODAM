package POO.Ejercicio4;

public class Tema {
    private String nombre;

    //Constructor
    public Tema(String nombre){
        this.nombre = nombre;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {this.nombre = nombre; }

    @Override
    public String toString() {
        return nombre;
    }
}

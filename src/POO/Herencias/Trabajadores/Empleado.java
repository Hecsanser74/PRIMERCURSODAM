package POO.Herencias.Trabajadores;

import java.util.Set;

public class Empleado {
    private String nombre;

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    public  Empleado (String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Empleado: "+getNombre();
    }
}

package POO.Ejercicio4;

public class Autor {
    private String nombre;
    private String fechaNacimiento;

    //Getters
    public String getNombre() {return nombre; }

    public String getFechaNacimiento() {return fechaNacimiento; }

    //Setters
    public void setNombre(String nombre){this.nombre = nombre; }

    public void setFechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento; }

    //Constructor
    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre+" Nacido en: "+fechaNacimiento;
    }
}

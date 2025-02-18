package POO.Herencias.Trabajadores;

public class Directivo extends Empleado{
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString(){
        return "Directivo: "+getNombre();
    }
}

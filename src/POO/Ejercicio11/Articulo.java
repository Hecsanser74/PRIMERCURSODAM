package POO.Ejercicio11;

public class Articulo {
    private String nombre;
    private double precio;
    private Lote lote;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Lote getLote() {
        return lote;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    //Constructor
    public Articulo(String nombre, double precio, Lote lote){
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
    }
}

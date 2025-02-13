package POO.Ejercicio11;

public class Puja {
    private Pujador pujador;
    private Lote lote;
    private double cantidad;

    //Getters
    public Pujador getPujador() {
        return pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public double getCantidad() {
        return cantidad;
    }

    //Setters
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    // Constructor
    public Puja(Pujador pujador, Lote lote, double cantidad) {
        this.pujador = pujador;
        this.lote = lote;
        this.cantidad = cantidad;
    }
}

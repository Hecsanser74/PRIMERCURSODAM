package POO.Ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int numero;
    private double precioSalida;
    private Set<Articulo> articuloSet;
    private Pujador pujador;
    private double pujaMaxima;

    //Getters
    public double getPrecioSalida() {
        return precioSalida;
    }

    public int getNumero() {
        return numero;
    }

    public Set<Articulo> getArticuloSet() {
        return articuloSet;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public double getPujaMaxima() {
        return pujaMaxima;
    }

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public void addArticulos(Articulo articulo){
        this.articuloSet.add(articulo);
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public void setPujaMaxima(double pujaMaxima) {
        this.pujaMaxima = pujaMaxima;
    }

    //Metodo
    public void añadirPuja(Puja puja) {
        if (puja.getCantidad() > pujaMaxima) {
            pujaMaxima = puja.getCantidad();
            this.pujador = puja.getPujador();
        }
    }

    // Constructor
    public Lote(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articuloSet = new HashSet<>();
        this.pujaMaxima = precioSalida;
    }
}

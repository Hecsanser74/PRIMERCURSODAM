package POO.Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    //Getters
    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    //Setters
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Constructor
    public Cuenta(String titular){
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad){
        this.cantidad = cantidad;
        this.titular = titular;
    }

    //Metodos
    public void IngresarDinero(double cantidad){
        if (cantidad > 0) this.cantidad += cantidad;
    }

    public void RetirarDinero(double cantidad){
        if (cantidad < this.cantidad && cantidad > 0)this.cantidad -= cantidad;

    }

    @Override
    public String toString(){
        return "El titular de la cuenta es "+this.titular+" y la cantidad que tiene en el banco es: "+this.cantidad+"€";
    }

}

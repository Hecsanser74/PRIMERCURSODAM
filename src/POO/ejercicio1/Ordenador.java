package POO.ejercicio1;

public class Ordenador {
    private String Marca;
    private String Modelo;
    private double Precio;
    private int Stock;


    //Getters
    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }


    //Setters
    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    //Constructor
    public Ordenador (String Marca, String Modelo, double Precio, int Stock){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    @Override
    public String toString(){
        return this.Marca + " " + this.Modelo + " cuesta " + this.Precio + " y quedan " + this.Stock;
    }
}

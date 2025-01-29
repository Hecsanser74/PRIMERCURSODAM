package POO.Ejercicio5;

public class Prestec {
    private int numPrestec; //ID de Prestec
    private Sucursal sucursal; //Relacion con Sucursal
    private Client client; //Relacion con Client

    //Getters
    public int getNumPrestec() {
        return numPrestec;
    }

    public int getSucursal() {
        return sucursal.getNumSucursal();
    }

    public String getClient() {
        return client.getDNI();
    }

    //Constructor
    public Prestec(int numPrestec, Sucursal sucursal, Client client) {
        this.numPrestec = numPrestec;
        this.sucursal = sucursal;
        this.client = client;
    }
}

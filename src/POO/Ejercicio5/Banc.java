package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banc {
    private int numEntidad; //ID Banc
    private Set<Sucursal> sucursals; //Relacion ocn Sucursal

    //Getters
    public int getNumEntidad() {
        return numEntidad;
    }

    public Set<Sucursal> getSucursals() {
        return sucursals;
    }

    //Setter para añadir sucursales
    public void addSucursal(Sucursal sucursal) {
        this.sucursals.add(sucursal);
    }

    //Constructor
    public Banc(int numEntidad) {
        this.numEntidad = numEntidad;
        this.sucursals = new HashSet<>();
    }
}

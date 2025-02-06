package POO.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int numSucursal;
    private Banc banc;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> comptesCorrents;

    //Getters
    public int getNumSucursal() {
        return numSucursal;
    }

    public int getBanc() {
        return banc.getNumEntidad();
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public Set<CompteCorrent> getComptesCorrents() {
        return comptesCorrents;
    }

    //Setters
    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public void addComptesCorrents(CompteCorrent compteCorrent) {
        this.comptesCorrents.add(compteCorrent);
    }

    //Constructor
    public Sucursal(int numSucursal, Banc banc) {
        this.numSucursal = numSucursal;
        this.banc = banc;
        this.prestecs = new HashSet<>();
        this.comptesCorrents = new HashSet<>();
    }
}

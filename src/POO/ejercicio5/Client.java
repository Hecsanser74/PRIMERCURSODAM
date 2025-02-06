package POO.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private final String DNI; //ID Client
    private Set<Prestec> prestecs; //Relacion con Prestec
    private Set<CompteCorrent> comptesCorrents; //Relacion con CompteCorrent

    //Getters
    public String getDNI() {return DNI; }

    public Set<Prestec> getPrestecs() {return prestecs; }

    public Set<CompteCorrent> getComptesCorrents() {return comptesCorrents; }

    //Setters
    public void addPrestecs(Prestec prestec) {this.prestecs.add(prestec); }

    public void addComptesCorrents(CompteCorrent compteCorrent) {this.comptesCorrents.add(compteCorrent); }

    //Constructor
    public Client(String DNI) {
        this.DNI = DNI;
        this.prestecs = new HashSet<>();
        this.comptesCorrents = new HashSet<>();
    }
}

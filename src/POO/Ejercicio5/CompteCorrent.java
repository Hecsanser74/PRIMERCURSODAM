package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CompteCorrent {
    private int numCompteCorrent; //ID CompteCorent
    private Sucursal sucursal; //Relacion con Sucursal
    private Set<Domiciliacio> domiciliacions; //Relacion con Domiciliacio
    private Set<Client> clients; //Relacion con Client

    //Getters
    public int getNumCompteCorrent() {
        return numCompteCorrent;
    }

    public int getSucursal() {
        return sucursal.getNumSucursal();
    }

    public Set<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public Set<Client> getClients() {
        return clients;
    }

    //Settes
    public void addDomiciliacions(Domiciliacio domiciliacio) {
        this.domiciliacions.add(domiciliacio);
    }

    public void addClients(Client client) {
        this.clients.add(client);
    }

    //Constructor
    public CompteCorrent(int numCompteCorrent, Sucursal sucursal) {
        this.numCompteCorrent = numCompteCorrent;
        this.sucursal = sucursal;
        this.domiciliacions = new HashSet<>();
        this.clients = new HashSet<>();
    }
}

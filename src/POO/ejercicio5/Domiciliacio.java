package POO.ejercicio5;

public class Domiciliacio {
    private int numDomiciliacio; //ID Domiciliacions
    private CompteCorrent compteCorrent; //Relacion con CompteCorrent

    //Getters
    public int getNumDomiciliacio() {
        return numDomiciliacio;
    }

    public int getCompteCorrent() {
        return compteCorrent.getNumCompteCorrent();
    }

    //Constructor
    public Domiciliacio(int numDomiciliacio, CompteCorrent compteCorrent) {
        this.numDomiciliacio = numDomiciliacio;
        this.compteCorrent = compteCorrent;
    }
}

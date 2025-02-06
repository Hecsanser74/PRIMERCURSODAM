package POO.ejercicio5;

public class ClientCompteCorrentPriv {
    private CompteCorrent compteCorrent; //ID de CompteCorrent
    private Client client; //ID de Client
    private int priv; //ID del atributo de la relacion

    //Getters
    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public Client getClient() {
        return client;
    }

    public int getPriv() {
        return priv;
    }

    //Constructor
    public ClientCompteCorrentPriv(CompteCorrent compteCorrent, Client client, int priv) {
       this.compteCorrent = compteCorrent;
       this.priv = priv;
    }
}

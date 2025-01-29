package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un banco
        Banc banc = new Banc(1);

        // Crear una sucursal para el banco
        Sucursal sucursal = new Sucursal(101, banc);
        banc.addSucursal(sucursal);

        // Crear un cliente
        Client client = new Client("12345678A");

        // Crear una cuenta corriente para el cliente en la sucursal
        CompteCorrent compteCorrent = new CompteCorrent(1001, sucursal);
        client.addComptesCorrents(compteCorrent);
        sucursal.addComptesCorrents(compteCorrent);

        // Crear un préstamo para el cliente en la sucursal
        Prestec prestec = new Prestec(2001, sucursal, client);
        client.addPrestecs(prestec);
        sucursal.addPrestecs(prestec);

        // Crear una domiciliación para la cuenta corriente
        Domiciliacio domiciliacio = new Domiciliacio(3001, compteCorrent);
        compteCorrent.addDomiciliacions(domiciliacio);

        // Crear una relación privada entre el cliente y la cuenta corriente
        ClientCompteCorrentPriv clientCompteCorrentPriv = new ClientCompteCorrentPriv(compteCorrent, client, 1);

        // Mostrar información
        System.out.println("Banco: " + banc.getNumEntidad());
        System.out.println("Sucursal: " + sucursal.getNumSucursal() + " pertenece al banco: " + sucursal.getBanc());
        System.out.println("Cliente con DNI: " + client.getDNI() + " tiene " + client.getComptesCorrents().size() + " cuentas corrientes y " + client.getPrestecs().size() + " préstamos.");
        System.out.println("Cuenta Corriente: " + compteCorrent.getNumCompteCorrent() + " tiene " + compteCorrent.getDomiciliacions().size() + " domiciliaciones.");
        System.out.println("Préstamo: " + prestec.getNumPrestec() + " asociado al cliente: " + prestec.getClient());
        System.out.println("Domiciliación: " + domiciliacio.getNumDomiciliacio() + " asociada a la cuenta corriente: " + domiciliacio.getCompteCorrent());
        System.out.println("Relación privada entre cliente y cuenta corriente con priv: " + clientCompteCorrentPriv.getPriv());
    }
}

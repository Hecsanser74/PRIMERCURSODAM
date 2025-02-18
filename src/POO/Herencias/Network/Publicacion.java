package POO.Herencias.Network;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacion {
    private static int contadorId = 0; // Generador de IDs únicos
    private int id;
    private String autor;
    private int meGusta;

    // Getters
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public int getMeGusta() {
        return meGusta;
    }

    //Constructor
    public Publicacion(String autor) {
        this.id = ++contadorId;
        this.autor = autor;
        this.meGusta = 0;
    }

    //Metodos
    public void darMeGusta() {
        this.meGusta++;
    }

    public void mostrar() {
        System.out.println("Publicación [" + getId() + "]");
        System.out.println("Autor: " + getAutor());
        System.out.println("Me gusta: " + getMeGusta());
    }
}

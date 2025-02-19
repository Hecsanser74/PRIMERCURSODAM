package POO.Herencias.Network;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private static int contadorId = 0; // Generador de IDs únicos
    private int id;
    private String autor;
    private LocalDateTime marcaTemporal;
    private int meGusta;
    private List<String> comentarios;

    // Getters
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDateTime getMarcaTemporal() {
        return marcaTemporal;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    //Constructor
    public Publicacion(String autor) {
        this.id = ++contadorId; // Genera un ID único
        this.autor = autor;
        this.marcaTemporal = LocalDateTime.now(); // Fecha y hora actual
        this.meGusta = 0;
        this.comentarios = new ArrayList<>();
    }

    //Metodos
    public void darMeGusta() {
        this.meGusta++;
    }

    public void agregarComentario(String comentario) {
        this.comentarios.add(comentario);
    }

    public void mostrar() {
        System.out.println("Publicación [" + getId() + "]");
        System.out.println("Autor: " + getAutor());
        System.out.println("Fecha: " + getMarcaTemporal().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Me gusta: " + getMeGusta());
        System.out.println("Comentarios: " + getComentarios());
    }
}
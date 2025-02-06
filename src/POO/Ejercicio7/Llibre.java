package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Llibre {
    private String isbn; //Identificador de Llibre
    private Set<Autor> autorSet; //Relacion con Autor
    private Tema tema; //Relacion con Tema
    private Editorial editorial; //Relacion con Editorial
    private Set<Exemplar> exemplars; //Relacion con Exemplar

    //Getters
    public Editorial getEditorial() {
        return editorial;
    }

    public Set<Autor> getAutorSet() {
        return autorSet;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public String getIsbn() {
        return isbn;
    }

    public Tema getTema() {
        return tema;
    }

    //Setters
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void addExemplar(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }

    public void addAutor(Autor autor){
        this.autorSet.add(autor);
    }

    //Constructor
    public Llibre (String isbn, Tema tema, Editorial editorial){
        this.isbn = isbn;
        this.tema = tema;
        this.editorial = editorial;
        this.autorSet = new HashSet<>();
        this.exemplars = new HashSet<>();
    }
}

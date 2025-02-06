package POO.ejercicio4;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private Tema temas;

    //Getters
    public String getTitulo() {return titulo; }

    public Autor getAutor() {return autor; }

    public int getPaginas() {return paginas; }

    public Tema getTemas() {
        return temas;
    }

    //Setters
    public void setTitulo(String titulo) {this.titulo = titulo; }

    public void setAutor(Autor autor) {this.autor = autor; }

    public void setPaginas(int paginas) {this.paginas = paginas; }

    public void setTemas(Tema temas) {this.temas = temas; }


    //Constructor
    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString(){
        return "Libro: "+titulo+" Autor: "+autor+" Paginas: "+paginas+" Temas: "+temas;
    }
}

package POO.Herencias.Network;

import POO.Herencias.Network.Publicacion;

public class PubFotograficas extends Publicacion {
    private String nombreArchivo;
    private String titulo;

    public PubFotograficas(String autor, String nombreArchivo, String titulo) {
        super(autor);
        this.nombreArchivo = nombreArchivo;
        this.titulo = titulo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo: Publicación fotográfica");
        System.out.println("Título: " + titulo);
        System.out.println("Archivo: " + nombreArchivo);
    }
}
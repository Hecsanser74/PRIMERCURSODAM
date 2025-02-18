package POO.Herencias.Network;

public class PubTexto extends Publicacion {
    private String mensaje;

    public PubTexto(String autor, String mensaje) {
        super(autor);
        this.mensaje = mensaje;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo: Publicación de texto");
        System.out.println("Mensaje: " + mensaje);
    }
}

package POO.Ejercicio4;

public class Main {
    public static void main(String[] args) {

    //Crear autores
    Autor autor1 = new Autor("Juana de Arco", "12-01-1997");
    Autor autor2 = new Autor("Pau Moreno Catalan", "7-08-2005");

    //Crear temas
     Tema tema1 = new Tema("Romance");
     Tema tema2 = new Tema("Novela");
     Tema tema3 = new Tema("Terror");
     Tema tema4 = new Tema("Ficcion");

     //Crear libros
     Libro libro1 = new Libro("100 Paumos sobre el cielo", autor2, 453);
     libro1.setTemas(tema1);
     libro1.setTemas(tema4);

     Libro libro2 = new Libro("Xumelo se puso a estudiar", autor1, 534);
     libro2.setTemas(tema2);
     libro2.setTemas(tema3);

        System.out.println(libro1);
        System.out.println(libro2);


    }
}

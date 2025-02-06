package POO.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor("Edgar Allan Poe");
        Autor autor2 = new Autor("Paulo Coelho");

        // Crear editoriales
        Editorial editorial1 = new Editorial("NoBooks");
        Editorial editorial2 = new Editorial("Planeta");

        // Crear temas
        Tema tema1 = new Tema("Novela");
        Tema tema2 = new Tema("Poema");

        // Crear libros
        Llibre llibre1 = new Llibre("9780963113535", tema1, editorial1);
        Llibre llibre2 = new Llibre("9788506085806", tema2, editorial2);

        // Añadir autores a los libros
        llibre1.addAutor(autor1);
        llibre2.addAutor(autor2);

        // Crear ejemplares
        Exemplar exemplar1 = new Exemplar("EX1", llibre1, null);
        Exemplar exemplar2 = new Exemplar("EX2", llibre2, null);

        // Crear lectores
        Lector lector1 = new Lector("Y3330594R");
        Lector lector2 = new Lector("V10778835");

        // Crear préstamos
        Prestec prestec1 = new Prestec("18.08.2018", lector1, exemplar1);
        Prestec prestec2 = new Prestec("26.09.2022", lector2, exemplar2);

        // Añadir préstamos a los lectores
        lector1.addExemplarPrestec(exemplar1);
        lector2.addExemplarPrestec(exemplar2);

        // Crear registros históricos
        Historic historic1 = new Historic("18.08.2018", "26.06.2020", lector1, exemplar1);
        Historic historic2 = new Historic("26.09.2022", "20.05.2024", lector2, exemplar2);

        // Añadir registros históricos a los lectores
        lector1.addExemplarHistoric(exemplar1);
        lector2.addExemplarHistoric(exemplar2);

        // Mostrar información
        System.out.println("Libro 1: " + llibre1.getIsbn() +" - Tema: " + llibre1.getTema().getCodTema());
        System.out.println("Libro 2: " + llibre2.getIsbn() + " - Tema: " + llibre2.getTema().getCodTema());

        System.out.println("Lector 1: " + lector1.getDNI() + " tiene prestado el ejemplar: " + prestec1.getExemplar().getN_red());
        System.out.println("Lector 2: " + lector2.getDNI() + " tiene prestado el ejemplar: " + prestec2.getExemplar().getN_red());

        System.out.println("Histórico Lector 1: " + historic1.getData_p() + " - " + historic1.getData_t());
        System.out.println("Histórico Lector 2: " + historic2.getData_p() + " - " + historic2.getData_t());
    }
}

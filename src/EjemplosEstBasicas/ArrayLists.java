package EjemplosEstBasicas;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Añadir elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Mostrar elementos
        System.out.println(frutas); // [Manzana, Banana, Naranja]

        // Acceder a un elemento
        System.out.println(frutas.get(1)); // Banana

        // Eliminar un elemento
        frutas.remove("Banana");
        System.out.println(frutas); // [Manzana, Naranja]
    }
}

//A diferencia de un array normal, su tamaño puede cambiar dinámicamente (se puede agrandar o achicar).


package EjemplosEstBasicas;

import java.util.ArrayList;

public class FlujosStreams {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // Filtrar números mayores que 2 y mostrarlos
        numeros.stream()
                .filter(n -> n > 2)
                .forEach(System.out::println); // 3, 4
    }
}

//Puedes filtrar, mapear o reducir datos de manera compacta.
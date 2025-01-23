package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MejorTerminacion {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        HashMap<Integer, Integer> mapa = new HashMap<>();
        ArrayList<String> boletos = new ArrayList<>();
        int numeroFinal = 0;

        boletos.add("45356");
        boletos.add("46534");
        boletos.add("87613");
        boletos.add("81763");
        boletos.add("09157");

        for (String i : boletos){
            //Hace que numeroFinal se convierta en el valor numerico de la posicion 4 de el boleto actual
            numeroFinal = Character.getNumericValue(i.charAt(4));
            //Pone el numero final, y despues dice lo siguiente: Si numeroFinal no existe devuelve 0 si existe suma 1
            mapa.put(numeroFinal, mapa.getOrDefault(numeroFinal, 0) +1);
        }

        System.out.print(mapa);

    }
}
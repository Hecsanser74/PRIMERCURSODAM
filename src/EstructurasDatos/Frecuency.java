package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuency {
    public static void main (String[] args) {
        Map<String, Integer> mapa1 = new HashMap<>();
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner inputValue = new Scanner(System.in);
        String cadenaEscrita = "";

        while (true){
            System.out.println("Escribe una palabra aqui y para finalizar pulsa enter vacio: ");
            cadenaEscrita = inputValue.nextLine();

            if (cadenaEscrita.isBlank()) break;
            cadenas.add(cadenaEscrita);
        }

        for (String i : cadenas){
            mapa1.put(i, mapa1.getOrDefault(i, 0) +1);
        }

        System.out.println(mapa1);
    }
}


package EstructurasDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main (String[] args){
        Scanner inputValue = new Scanner(System.in);
        String respuesta = "";

        Map<String, String> mapa = new HashMap<String, String>();

        mapa.put("España", "Madrid");
        mapa.put("Alemania", "Berlin");
        mapa.put("Belgica", "Bruselas");
        mapa.put("Malta", "La Valeta");
        mapa.put("Suecia", "Estocolmo");
        mapa.put("Letonia", "Riga");

        System.out.println(mapa.keySet());
        System.out.println();
        System.out.println("Introduce aqui uno de los paises para seber su capital: ");
        respuesta = inputValue.nextLine();

        capital(mapa, respuesta);
    }

    public static String capital (Map<String, String> mapa, String respuesta){
        if (mapa.containsKey(respuesta)){
            System.out.println("La capital de este pais es: " +mapa.get(respuesta));
        }
        return respuesta;
    }

}

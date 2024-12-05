package EstructurasDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main (String[] args){
        Scanner inputValue = new Scanner(System.in);
        String respuesta = "";

        Map<String, String> mapa = new HashMap<String, String>();

        mapa.put("Pau", "655056836");
        mapa.put("Hector", "693790634");
        mapa.put("Leo", "642832231");
        mapa.put("Alejandro", "644280983");

        System.out.println(mapa.keySet());
        System.out.println();
        System.out.println("Introduce uno de los nombres para saber el numero de telefono: ");
        respuesta = inputValue.nextLine();

        capital(mapa, respuesta);
    }

    public static String capital (Map<String, String> mapa, String respuesta){
        if (mapa.containsKey(respuesta)){
            System.out.println("El numero de esta persona es: " +mapa.get(respuesta));
        } else System.out.println("El nombre no esta.");
        return respuesta;
    }
}

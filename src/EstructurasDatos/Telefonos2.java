package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main (String[] args){
        Scanner inputValue = new Scanner(System.in);
        String respuesta = "";

        Map<String, ArrayList<String>> mapa = new HashMap<>();

        ArrayList<String> telefonos = new ArrayList<>();

        telefonos.add("693790634");
        telefonos.add("642832231");
        mapa.put("Hector", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("603123456");
        telefonos.add("689876543");
        mapa.put("Leo", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("672543210");
        telefonos.add("618987654");
        mapa.put("Pau", telefonos);

        System.out.println(mapa.keySet());
        System.out.println();
        System.out.println("Introduce uno de los nombres para saber el numero de telefono: ");
        respuesta = inputValue.nextLine();

        capital(mapa, respuesta);
    }

    public static String capital (Map<String, ArrayList<String>> mapa, String respuesta){
        if (mapa.containsKey(respuesta)){
            System.out.println("El numero de esta persona es: " +mapa.get(respuesta));
        } else System.out.println("El nombre no esta.");
        return respuesta;
    }

}

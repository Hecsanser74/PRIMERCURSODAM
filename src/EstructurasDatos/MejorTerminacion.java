package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion {
    public static void main (String[] args){
        Map<Integer, Integer> mapa1 = new HashMap<>();
        ArrayList<String> boletos = new ArrayList<>();
        int numFinal;

        boletos.add("34567");
        boletos.add("12585");
        boletos.add("78956");
        boletos.add("12456");
        boletos.add("46754");

        for (String i : boletos){
            numFinal = Character.getNumericValue(i.charAt(4));
            mapa1.put(numFinal, mapa1.getOrDefault(numFinal, 0) +1);
        }

        System.out.println(mapa1);

    }
}

package EstructurasDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        Scanner inputValue = new Scanner(System.in);
        Map<String, Integer> mapa1 = new HashMap<>();
        String line;
        String pais;

        System.out.println("Introduce el pais del que quieras saber los aumnos: ");
        pais = inputValue.nextLine();

        while ((line = reader.readLine())!=null) {

            String[] saltos = line.split(",");

            Integer freq = mapa1.get(saltos[6]);
            if (freq == null)
                mapa1.put(saltos[6], 1);

            else mapa1.put(saltos[6], freq+1);

            mapa1.put(saltos[6], freq==null ? 1: freq+1);
        }

        System.out.println("En este pais la antidad de alumnos es la siguiente: "+mapa1.getOrDefault(pais, 0));
        reader.close();
    }
}

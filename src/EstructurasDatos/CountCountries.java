package EstructurasDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        Scanner inputValue = new Scanner(System.in);
        String line;
        String pais;

        System.out.println("Introduce el pais del que quieras saber los aumnos: ");
        pais = inputValue.nextLine();
        System.out.println("De este pais hay " +paisPers().get(pais)+ " personas");
        System.out.println();
        System.out.println(paisPers());

    }

    public static HashMap<String, Integer> paisPers() throws IOException {
        HashMap<String, Integer> mapaCountry = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("/home/hector/Descargas/Colfuturo-Seleccionados.csv"));
        String line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] saltos = line.split(",");
            String pais = saltos[6];
            Integer cuantoSale = mapaCountry.get(pais);
            if (cuantoSale == null) {
                mapaCountry.put(pais, 1);
            } else {
                mapaCountry.put(pais, cuantoSale + 1);
            }
        }
        reader.close();
        return mapaCountry;
    }
}



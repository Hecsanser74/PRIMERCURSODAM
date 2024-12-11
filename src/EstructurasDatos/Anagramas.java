package EstructurasDatos;
import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("spanish-dict.txt"));
        Map<String, ArrayList<String>> mapa1 = new HashMap<>();
        ArrayList<String> palabrasIguales;
        int valoresMinimos;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Escribe el minimo de valores que quieres que salgan por pantalla: ");
        valoresMinimos = inputValue.nextInt();

        String line;
        while ((line = reader.readLine())!=null) {
            palabrasIguales = new ArrayList<>();
            ArrayList<String> palabrasSolucionadas = mapa1.getOrDefault(alphabetize(line), new ArrayList<>());

            for (String i : palabrasSolucionadas){
                palabrasIguales.add(i);
            }

            palabrasIguales.add(alphabetize(line));

            mapa1.put(alphabetize(line), palabrasIguales);

            if (mapa1.get(alphabetize(line)).size() > valoresMinimos){
                System.out.println(alphabetize(line) +" -- " + mapa1.get(alphabetize(line)) + " -- " + mapa1.get(alphabetize(line)).size());
            }

        }

        reader.close();
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}

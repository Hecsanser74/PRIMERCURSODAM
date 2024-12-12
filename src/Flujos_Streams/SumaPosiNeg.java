package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class SumaPosiNeg {
    public static void main (String[] args){
        List<String> numeros = new ArrayList<>();

        numeros.add("25");
        numeros.add("30");
        numeros.add("-20");

        long cuantosPos = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .count();

        long cuantosNeg = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .count();

        System.out.println("Hay "+cuantosPos+" numeros positivos y "+cuantosNeg+" negativos");

    }
}

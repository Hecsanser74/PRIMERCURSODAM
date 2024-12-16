package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class SumaPosiNeg {
    public static void main (String[] args){
        List<String> numeros = new ArrayList<>();

        //.map(value --> value > 5); Apunte
        //.collect(collector.toCollection(...)); Apunte
        //.count(); Contar Apuntes
        //.forEach(); Definir que se hace con el valor Apuntes
        //.collect(Collectors.toList()); Guardar los valores en otra coleccion

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

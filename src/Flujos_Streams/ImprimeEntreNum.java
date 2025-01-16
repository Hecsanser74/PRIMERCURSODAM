package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ImprimeEntreNum {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroEscrito;
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true){
            System.out.println("Introduce un numero: ");
            numeroEscrito = inputValue.nextInt();

            if (numeroEscrito < 0) break;

           numeros.add(numeroEscrito);
        }

        ArrayList<Integer> numeroEntre = (ArrayList<Integer>) numeros.stream()
                .filter(n -> n >= 1 && n <= 5)
                .collect(Collectors.toList());

        System.out.println("Los numeros que estan entre el 1 y 5 son: "+numeroEntre);
    }
}

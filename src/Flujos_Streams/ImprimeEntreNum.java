package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ImprimeEntreNum {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.println("Introduce un numero (Negativo para terminar): ");
            int num = inputValue.nextInt();
            if (num < 0) {
                break;
            }
            numeros.add(num);
        }
        List<Integer> numeritos = numeros.stream()
                .filter(s -> s >= 1 && s <= 5)
                .collect(Collectors.toList());

        System.out.println("Los numeros entre 1 y 5 son: " +numeritos);
    }
}

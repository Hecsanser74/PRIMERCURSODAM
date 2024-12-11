package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Botin {
    public static void main(String[] args) {
        ArrayList<Integer> dinero = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> mapa1 = new HashMap<>();
        int tripulantes;
        String billete;
        int billeteInt;
        int miembroActual = 0;
        Scanner inputValue = new Scanner(System.in);

        //Pedimos miembros de la banda
        System.out.println("Introduce cuantos tripulantes sois en la banda: ");
        tripulantes = inputValue.nextInt();

        // Inicializar el mapa para los miembros
        for (int i = 0; i < tripulantes; i++) {
            mapa1.put(i, new ArrayList<>());
        }

        //Pedimos los billetes uno a uno
        inputValue.nextLine();
        while (true) {
            System.out.println("Introduce aqui los billetes que hay uno a uno por su valor, para salir pulsa enter en vacio: ");
            billete = inputValue.nextLine();

            //Si dejamos en blanco se termina
            if (billete.isBlank()) {
                break;
            }

            //Lo pasamos a Integuer ya que lo teniamos como String, ya que si es integuer no dejaba poner el Blank
            billeteInt = Integer.parseInt(billete);
            dinero.add(billeteInt);
        }

        for (int i : dinero) {
            // Ponemos que el billete actual se lo quede el miembro actual
            mapa1.get(miembroActual).add(i);

            // Pasamos al siguiente miembro
            miembroActual++;
            if (miembroActual == tripulantes) { // Si llegamos al final de los miembros, reiniciar
                miembroActual = 0;
            }
        }

            // Mostramos el reparto de billetes
            System.out.println("Reparto de billetes:");
            for (int i = 0; i < mapa1.size(); i++) {
            System.out.println("Miembro " + (i + 1) + ": " + mapa1.get(i));
        }
    }
}

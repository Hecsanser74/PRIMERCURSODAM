package EstructurasDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Botin {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        HashMap<Integer, ArrayList<String>> reparto = new HashMap<>();
        ArrayList<Integer> billetes = new ArrayList<>();
        int dineroescrito;
        int miembroActual = 0;
        int participantes = 0;

        //Pedimos numero de participantes en el golpe
        System.out.println("Introduce el numero de trripulantes que participan en el golpe: ");
        participantes = inputValue.nextInt();

        //for para guardar los tripulantes en el mapa (1, 2, 3) asi
        for (int i = 0; i < participantes; i++){
            reparto.put(i, new ArrayList<>());
        }

        //Pedimos los billetes en un bucle true ya que no sabemos cuantos hay
        while (true){
            System.out.println("Introduce un billete: ");
            dineroescrito = inputValue.nextInt();

            if (dineroescrito < 0) break;

            billetes.add(dineroescrito);
        }

        //Decimos que el billete actual es para el miembro actual
        for (int i : billetes){
            reparto.get(miembroActual).add(String.valueOf(i));
            miembroActual++;
            if (miembroActual == participantes){
                miembroActual = 0;
            }
        }

        System.out.println(reparto);


    }
}
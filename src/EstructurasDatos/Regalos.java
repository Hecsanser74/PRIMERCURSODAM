package EstructurasDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Regalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> portal = new ArrayList<Integer>();
        ArrayList<Integer> ordenRepartos = new ArrayList<>();

        portal.add(3);
        portal.add(2);
        portal.add(5);
        portal.add(1);
        int primerPortal = portal.get(0);


        System.out.println("Los portales en los que se va a repartir regalos son: ");
        System.out.println(portal);

        System.out.println("Orden de portales");
        ordenRepartos = repartos(portal, primerPortal);
        System.out.println(ordenRepartos);

    }

    public static ArrayList<Integer> repartos (ArrayList<Integer> portal, int primerPortal) {
        ArrayList<Integer> ordenRepartos = new ArrayList<>();

        int actual = primerPortal;

        portal.remove((Integer) primerPortal);

        while (!portal.isEmpty()) {
            int contador = -1;
            int minimo = 88888;
            for (int numero : portal) {
                int distancia = Math.abs(numero - actual);
                if (distancia < minimo || distancia == minimo && numero > contador) {
                    minimo = distancia;
                    contador = numero;
                }
            }
            ordenRepartos.add(contador);
            portal.remove((Integer)contador);
            actual = contador;
        }
        return ordenRepartos;
    }
}

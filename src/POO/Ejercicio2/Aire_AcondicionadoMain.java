package POO.Ejercicio2;

import java.util.Scanner;

public class Aire_AcondicionadoMain {
    public static void main (String[] args){
        Aire_Acondicionado aire = new Aire_Acondicionado("Samsung", 40, 2, 21);
        Aire_Acondicionado aire2 = new Aire_Acondicionado("Toshiba", 23, 3, 21);
        Scanner inputValue = new Scanner(System.in);
        String respuesta;


        aire.bajarTemperatura();
        aire2.subirTemperatira();
        aire2.subirTemperatira();
        aire2.subirTemperatira();

        System.out.println("---------------------");
        System.out.println();

        System.out.println(aire);
        System.out.println(aire2);

    }
}

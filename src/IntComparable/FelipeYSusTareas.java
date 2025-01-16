package IntComparable;

import java.util.ArrayList;
import java.util.Scanner;

public class FelipeYSusTareas {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int prioridad;
        int duracion;

        ArrayList<procesos> proceso = new ArrayList<>();

        System.out.println("Cuantas tareas tiene pendientes felipe: ");
        int tarea = inputValue.nextInt();

        while (tarea > 0){
            for (int i = 0; i < tarea; i++){
            System.out.println("Inroduce prioridad tarea");
            prioridad = inputValue.nextInt();

            System.out.println("Introduce duracion tarea: ");
            duracion = inputValue.nextInt();

            proceso.add(new procesos(prioridad, duracion));
            }
            System.out.println("Introduce mas tareas");
            tarea = inputValue.nextInt();
            if (tarea == 0) break;
    }

     //Sort ordena
     proceso.sort((pro1, pro2) -> Integer.compare(pro2.getPrioridad(), pro1.getPrioridad()));

        for (procesos i : proceso){
            System.out.println(i.getPrioridad()+" "+i.getDuracion());
        }
    }
}

package EjemplosExamen;

import java.util.LinkedList;
import java.util.Queue;

public class ColaQueue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("A");
        cola.add("B");
        cola.add("C");

        System.out.println(cola.poll()); // A (se elimina)
        System.out.println(cola.peek()); // B (sin eliminarlo)
    }
}

//Una cola (Queue) sigue el principio FIFO (primero en entrar, primero en salir).

package EjemplosEstBasicas;

import java.util.Stack;

public class PilasStacks {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println(pila.pop()); // C (se elimina)
        System.out.println(pila.peek()); // B (sin eliminarlo)
    }
}

//Una pila (Stack) funciona bajo el principio LIFO (último en entrar, primero en salir).
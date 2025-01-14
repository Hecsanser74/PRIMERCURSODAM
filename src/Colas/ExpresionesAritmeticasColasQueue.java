package Colas;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ExpresionesAritmeticasColasQueue {
    public static void main(String[] args) {
        Queue<Integer> pila = new ArrayDeque<>();
        String espresion;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce una expresion porstfija, cada elemento separado por espacio: ");
        espresion = inputValue.nextLine();

        String[] chars;
        chars = espresion.split(" ");

        for (String u : chars) {
            if (Character.isDigit(u.charAt(0))) {
                pila.offer(Integer.parseInt(u));
            } else {
                int n2 = pila.poll();
                int n1 = pila.poll();
                switch (u) {
                    case "+":
                        pila.offer(n1 + n2);
                        break;
                    case "-":
                        pila.offer(n1 - n2);
                        break;
                    case "*":
                        pila.offer(n1 * n2);
                        break;
                    case "/":
                        pila.offer(n1 / n2);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(pila.poll());
    }
}

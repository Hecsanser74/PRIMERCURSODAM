package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class ExpresionesAritmeticasStackPilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        String espresion;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce una expresion porstfija, cada elemento separado por espacio: ");
        espresion = inputValue.nextLine();

        String[] chars;
        chars = espresion.split(" ");

        for (String u : chars) {
            if (Character.isDigit(u.charAt(0))) {
                pila.push(Integer.parseInt(u));
            } else {
                int n2 = pila.pop();
                int n1 = pila.pop();
                switch (u) {
                    case "+":
                        pila.push(n1 + n2);
                        break;
                    case "-":
                        pila.push(n1 - n2);
                        break;
                    case "*":
                        pila.push(n1 * n2);
                        break;
                    case "/":
                        pila.push(n1 / n2);
                        break;
                    default:
                        break;
                }
            }

        }
        System.out.println(pila.pop());
    }
}

package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        String cadena;
        boolean correcto = true;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce una cadena con parentesis: ");
        cadena = inputValue.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ')' || cadena.charAt(i) == ']' || cadena.charAt(i) == '}') {
                if (stack1.isEmpty()) {
                    correcto = false;
                    break;
                }
            }
            if (cadena.charAt(i) == '(') stack1.push('(');
            if (cadena.charAt(i) == '[') stack1.push('[');
            if (cadena.charAt(i) == '{') stack1.push('{');

            if (cadena.charAt(i) == ')'){
                if (stack1.peek().equals('(')) stack1.pop();
            }
            if (cadena.charAt(i) == ']'){
                if (stack1.peek().equals('[')) stack1.pop();
            }
            if (cadena.charAt(i) == '}'){
                if (stack1.peek().equals('{')) stack1.pop();
            }
        }

        if (!stack1.isEmpty()) correcto = false;

        if (correcto) {
            System.out.println("La cadena esta bien parentizada");
        } else System.out.println("La cadena esta mal parentizada");

        
    }
}

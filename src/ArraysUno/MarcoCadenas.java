package ArraysUno;

import java.util.Scanner;

public class MarcoCadenas {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        int max = 0;
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++){
            System.out.println("Introduce una cadena: ");
            cadenas[i] = inputValue.nextLine();
            if (cadenas[i].length() > max){
                max = cadenas[i].length();
            }
        }

        for (int i = 0; i < max + 4; i++) System.out.print("*");
        System.out.println();

        for (int i = 0; i < 5; i++){
                System.out.print("* " + cadenas[i]);
                for (int j = 0; j < max - cadenas[i].length() + 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
        }

        for (int i = 0; i < max + 4; i++) System.out.print("*");

    }
}

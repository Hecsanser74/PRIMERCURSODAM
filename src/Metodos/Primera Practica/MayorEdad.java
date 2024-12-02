import java.util.Scanner;

public class MayorEdad {
    public static void Mayor(int edad) {
        if (edad >= 18){
            System.out.println("Eres mayor de edad y sigues siendo virgen");
        } else System.out.println("Eres un menor pajero");
    }
    public static void main(String[] args) {
        int edad;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = inputValue.nextInt();
        Mayor(edad);
        System.out.println("Introduce tu edad");
        edad = inputValue.nextInt();
        Mayor(edad);
    }
}
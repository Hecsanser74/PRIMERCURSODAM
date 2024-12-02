import java.util.Scanner;

public class NotaExamen {
    public static void notaLetra(double nota) {
        if (nota < 3){
            System.out.println("Nota muy deficiente");
        } else if (nota < 5){
            System.out.println("Nota insufuciente");
        } else if (nota < 6){
            System.out.println("Nota suficiente");
        } else if (nota < 7){
            System.out.println("Nota Buena");
        } else if (nota < 9){
            System.out.println("Nota notable");
        } else if (nota <= 10){
            System.out.println("Nota sobresaliente");
        }
    }
    public static void main(String[] args) {

        double nota;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = inputValue.nextDouble();

        notaLetra(nota);
    }

}

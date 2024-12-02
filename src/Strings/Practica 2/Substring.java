import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        String cadena1;
        int posicion1;
        int posicion2;
        String resultado = "";
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce la primera posicion: ");
        posicion1 = inputValue.nextInt();
        System.out.println("Introduce la segunda posicion: ");
        posicion2 = inputValue.nextInt();

        System.out.println("La cadena es: "+subcadena(cadena1, posicion1, posicion2, resultado));

    }
    public static String subcadena (String cadena1, int posicion1, int posicion2, String resultado){
        resultado = cadena1.substring(posicion1, posicion2);
        return resultado;
    }
}

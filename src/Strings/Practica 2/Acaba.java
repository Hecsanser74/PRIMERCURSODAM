import java.util.Scanner;

public class Acaba {
    public static void main (String[] args){
        String cadena1;
        String cadena2;
        String respuesta = "";
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce la segunda: ");
        cadena2 = inputValue.nextLine();

        if (acabaEn(cadena1,cadena2,respuesta)){
            System.out.println("La cadena 1 acaba con la cadena 2");
        } else System.out.println("La cadena 1 no acaba con la 2");

    }
    public static boolean acabaEn (String cadena1, String cadena2,String respuesta){
        if (cadena1.endsWith(cadena2)){
            return true;
        } else return false;
    }
}

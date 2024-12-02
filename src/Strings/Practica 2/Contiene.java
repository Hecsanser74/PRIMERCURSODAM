import java.util.Scanner;

public class Contiene {
    public static void main (String[] args){
        String cadena1;
        String cadena2;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce la segunda: ");
        cadena2 = inputValue.nextLine();

        if (contieneString(cadena1, cadena2)){
            System.out.println("La cadena 1 si contiene la cadena 2");
        } else System.out.println("La cadena 1 no contiene la cadena 2");

    }
    public static boolean contieneString (String cadena1, String cadena2){
        if (cadena1.contains(cadena2)){
            return true;
        } else return false;
    }
}

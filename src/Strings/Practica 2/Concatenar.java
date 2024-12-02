import java.util.Scanner;

public class Concatenar {
    public static void main (String[] args){
        String cadena1;
        String cadena2;
        String concatenada = "";
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        cadena2 = inputValue.nextLine();

        System.out.println("La cadena concatenada es: " +cadenaConcat(cadena1, cadena2, concatenada));

    }
    public static String cadenaConcat (String cadena1, String cadena2, String cocatenada){
        cocatenada = cadena1.concat(cadena2);
        return cocatenada;
    }

}

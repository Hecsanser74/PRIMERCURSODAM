import java.util.Scanner;

public class Pasatiempos {
    public static void main(String[] args){
        String texto;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Introduce aqui un texto: ");
        texto = inputValue.nextLine();

        texto = texto.replaceAll("[aeiouAEIOU]", ".");

        System.out.println(texto);

    }
}

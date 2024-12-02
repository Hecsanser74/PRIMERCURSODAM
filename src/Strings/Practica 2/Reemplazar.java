import java.util.Scanner;

public class Reemplazar {
    public static void main(String[] args) {
        String cadena1;
        char caracterRemplazar;
        char caracterRemplazado;
        String resultado = "";
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce la primera cadena: ");
        cadena1 = inputValue.nextLine();
        System.out.println("Introduce por cual quieres remplazar: ");
        caracterRemplazado = inputValue.next().charAt(0);
        System.out.println("Introduce cual quieres quitar: ");
        caracterRemplazar = inputValue.next().charAt(0);

        System.out.println(remplazado(cadena1, caracterRemplazar, caracterRemplazado, resultado));
    }
    public static String remplazado (String cadena1, char caracterRemplazado, char caracterRemplazar, String resultado){
        resultado = cadena1.replace(caracterRemplazado, caracterRemplazar);
        return resultado;
    }
}

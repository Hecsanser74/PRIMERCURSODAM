import java.util.Scanner;

public class SumarBinario {
    public static void main(String[] args){
        String numero1;
        String numero2;
        String resultado = " ";
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Introduce un numero en binario: ");
        numero1 = inputValue.nextLine();

        System.out.println("Introduce otro numero binario: ");
        numero2 = inputValue.nextLine();

        for (int i = numero1.length() - 1; i >= 0; i--){
            if (numero1.charAt(i) == '0' && numero2.charAt(i) == '0') resultado += "0";
            else if (numero1.charAt(i) == '0' && numero2.charAt(i) == '1') resultado += "1";
            else if (numero1.charAt(i) == '1' && numero2.charAt(i) == '0') resultado += "1";
            else if (numero1.charAt(i) == '1' && numero2.charAt(i) == '1') {
                resultado += '0';
                for (int j = i; j >= 0; j--) {
                    if (numero1.charAt(j) == '0') {

                    }
                }
            }
        }
    }
}

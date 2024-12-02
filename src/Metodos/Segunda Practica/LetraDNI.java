import java.util.Scanner;

public class LetraDNI {
    public static char letraDni(int DNI) {
        char[] array = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K'};
        return array[DNI % 23];
    }
    public static void main(String[] args) {
        int DNI;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce aqui tu DNI: ");
        DNI = inputValue.nextInt();

        System.out.println(letraDni(DNI));

    }
}


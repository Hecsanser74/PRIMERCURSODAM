package EstructurasDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> altura = new ArrayList<Double>();
        String alumnos = "";
        int contAlumnos = 1;
        int Altos = 0;
        double media = 0;

        contAlumnos = numeroAlumnos(contAlumnos);
        leerAlturas(altura, contAlumnos);

        scanner.close();

        System.out.println("Alturas intoducidas: ");
        for (Double alturas  : altura){
            System.out.print( + alturas + ", ");
        }
        System.out.println("");

        media = calcularMedia(altura,contAlumnos);
        System.out.println("La altura media de la clase es de:");
        System.out.println(calcularMedia(altura, contAlumnos));

        System.out.println(calcularSuperior(altura, media) + " alumnos por encima de la media");

        System.out.println(calcularInferior(altura, media) + " alumnos por debajo de la media");
    }

    public static int numeroAlumnos (int contAlumnos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos de la clase: ");
        contAlumnos = scanner.nextInt();
        return contAlumnos;
    }

    public static ArrayList<Double> leerAlturas (ArrayList<Double>altura, int contAlumnos){
        Scanner scanner = new Scanner(System.in);
        double alturaalum = 0;
        for (int i = 0; i <contAlumnos; i++){
            System.out.println("Introduce la altura de alumno");
            alturaalum = scanner.nextDouble();
            altura.add(alturaalum);
        }
        return altura;
    }

    public static Double calcularMedia (ArrayList<Double>altura, int contAlumnos){
        double suma = 0;
        double media = 0;
        for (Double i : altura){
            suma = suma + i;
        }
        media = suma / contAlumnos;
        return media;
    }

    public static int calcularSuperior (ArrayList<Double>altura, double media){
        int contSup = 0;
        for (double i : altura){
            if (i > media) contSup++;
        }
        return contSup;
    }

    public static int calcularInferior (ArrayList<Double>altura, double media) {
        int contInf = 0;
        for (double i : altura) {
            if (i < media) contInf++;
        }
        return contInf;
    }
}
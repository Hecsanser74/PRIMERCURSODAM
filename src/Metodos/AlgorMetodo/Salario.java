package Metodos.AlgorMetodo;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        double horasTrabajadas;
        double precioHora;
        double Bruto;
        double impuestos;
        double Neto;

        System.out.print("Introduce las horas trabajadas: ");
        horasTrabajadas = inputValue.nextDouble();
        System.out.print("Introduce el precio por hora: ");
        precioHora = inputValue.nextDouble();

        Bruto = 0;
        if (horasTrabajadas < 35) {
            Bruto = horasTrabajadas * precioHora;
        } else {
            Bruto = (35 * precioHora) + ((horasTrabajadas - 35) * (precioHora * 1.5));
        }

        impuestos = 0;

        if (Bruto <= 500) {
            impuestos = 0;
        } else if (Bruto <= 900) {
            impuestos = ((Bruto - 500) * 25) / 100;
        } else {
            impuestos = ((400 * 25) / 100) + ((Bruto - 900) * 45) / 100;
        }

        Neto = Bruto - impuestos;

        System.out.println("Salario bruto: " + Bruto);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario neto: " + Neto);
    }
}



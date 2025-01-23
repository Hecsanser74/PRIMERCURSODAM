package Metodos.AlgorMetodo;

public class ComentarioMetodos {
 /**
 * Los primeros 500 € son libres de impuestos. Los próximos 400 € tienen un
 * impuesto del 25% Y el resto una tasa de impuestos del 45%.
 *
 * @param bruto
 * @return los impuestos
 */
public static double calcularImpuestos(double bruto) {
    double impuestos;
    if (bruto <= 500) {
        impuestos = 0.0;
    } else if (bruto <= 900) {
        impuestos = (bruto - 500) * 0.25f;
    } else {
        impuestos = (400 * 0.25) + (bruto - 500 - 400) * 0.45;
    }
    return impuestos;
}

    /**
     * Las primeras 35 horas se pagan al precio normal por hora. Las horas que
     * exceden esas 35 horas se pagan 1,5 veces el precio normal.
     *
     * @param horas
     * @param precioHora
     * @return el salario bruto
     */
    public static double calcularBruto(int horas, double precioHora) {
        double bruto;
        if (horas <= 35) {
            bruto = horas * precioHora;
        } else {
            bruto = 35 * precioHora;
            bruto += (horas - 35) * precioHora * 1.5;
        }
        return bruto;
    }

}

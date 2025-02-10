package POO.EjercicIo10;

public class MaquinaExpendedora {
    private double precioTicket;
    private double cajon;
    private double dineroInsertado;

    //Getters
    public double getPrecioTicket() {
        return precioTicket;
    }

    public double getCajon() {
        return cajon;
    }

    public double getDineroInsertado() {
        return dineroInsertado;
    }


    //Setters
    public void setCajon(double cajon) {
        this.cajon = cajon;
    }

    public void setDineroInsertado(double dineroInsertado) {
        this.dineroInsertado = dineroInsertado;
    }

    public void setPrecioTicket(double precioTicket) {
        this.precioTicket = precioTicket;
    }

    //Constructor
    public MaquinaExpendedora(double precioTicket) {
        this.precioTicket = precioTicket;
        this.cajon = 10;
        this.dineroInsertado = 0;
    }

    //Metodo insertar el dinero
    public void insertarDinero(double importe) {
        dineroInsertado += importe;
        System.out.println("Dinero insertado: " + importe + "€. Dinero total Igresado: " + dineroInsertado + "€");
    }

    //Metodo para sacar ticket
    public String sacarTicket() {
        if (dineroInsertado >= precioTicket) {
            double cambio = dineroInsertado - precioTicket;
            cajon += precioTicket;
            dineroInsertado = 0;
            return "El ticked ha sido emitido " + calcularCambio(cambio);
        } else {
            return "Dinero insuficiente, faltan " + (precioTicket - dineroInsertado) + "€.";
        }
    }

    //Metodo para calcular el cambio a devolver
    private String calcularCambio(double cambio) {
        double[] valores = {50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10};
        String resultado = "Cambio: " + cambio + "€ (";

        for (double valor : valores) {
            if (cambio >= valor) {
                int cantidad = (int) (cambio / valor);
                cambio -= cantidad * valor;
                resultado += cantidad + " x " + valor + "€, ";
            }
        }

        return resultado.substring(0, resultado.length() - 2) + ")";
    }
}

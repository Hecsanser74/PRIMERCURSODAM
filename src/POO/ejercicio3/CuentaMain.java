package POO.ejercicio3;

public class CuentaMain {
    public static void main (String[] args){
        Cuenta cuenta1 = new Cuenta("Leo", 3);
        Cuenta cuenta2 = new Cuenta("Pau");

        cuenta1.IngresarDinero(20);
        cuenta1.RetirarDinero(2);
        cuenta2.IngresarDinero(10);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}

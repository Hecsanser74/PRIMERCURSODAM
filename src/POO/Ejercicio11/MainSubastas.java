package POO.Ejercicio11;

public class MainSubastas {
    public static void main(String[] args){

        System.out.println("-SUBASTA-");
        System.out.println("·······················");

        Pujador pujador1 = new Pujador("Juan");
        Pujador pujador2 = new Pujador("Paumo");

        Lote lote1 = new Lote(52, 200.43);
        Lote lote2 = new Lote(53,123.32);

        lote1.addArticulos(new Articulo("PlayStation1 Aniversario", 150.23, lote1));
        lote1.addArticulos(new Articulo("Game Boy Advance", 70.50, lote1));

        lote2.addArticulos(new Articulo("Nintendo 3DS Pokemon edition", 100.75, lote2));
        lote2.addArticulos(new Articulo("Mueble ikea", 50, lote2));



    }
}

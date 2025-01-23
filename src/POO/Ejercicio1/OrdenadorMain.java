package POO.Ejercicio1;

public class OrdenadorMain {
    public static void main (String[] args){
        Ordenador ordenador= new Ordenador("Lenovo", "IdeaPad", 300, 43);
        Ordenador ordenador1 = new Ordenador("HP", "Ader", 499, 23);


        System.out.println(ordenador);
        System.out.println(ordenador1);

        System.out.println("EL precio del ordenador 1 es "+ ordenador1.getPrecio());
    }
}

import Utilidades.Utilidades;

public class EsPositivo {
    public static void main(String[] args) {
        int numero = Utilidades.leerEntero("Introduce aqui un numero:");
        System.out.println(comprobarNumero(numero));
    }

        public static boolean comprobarNumero(int numero){
            if (numero >= 0) return true;
            else return false;
        }
    }

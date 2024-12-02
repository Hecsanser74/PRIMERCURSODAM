import Utilidades.Utilidades;

public class ValorNotaTexto {
    public static void main(String[] args) {
        int nota = Utilidades.leerEntero("Introduce aqui tu nota:");
        System.out.println(convertirNota(nota));
    }
        public static String convertirNota(int nota) {
            if (nota < 3) return ("La nota es muy deficiente");
            else if (nota < 5) return ("La nota es Insuficiete");
            else if (nota < 6) return ("La nota es Suficiente");
            else if (nota < 7) return ("La nota es Buena");
            else if (nota < 9) return ("La nota es Notable");
            else return ("La nota es Sobresaliente");
        }
    }

package POO.ejercicio8;

public class JuegoDados {
    //Perimer metodo
    Dado dado1;
    Dado dado2;
    Dado dado3;

    //Primer metodo
   public void defineDados(){
        dado1 = new Dado((int) (Math.random() * 6 + 1));
        dado2 = new Dado((int) (Math.random()* 6 + 1));
        dado3 = new Dado((int) (Math.random() * 6 + 1));
    }

    //Segundo Metodo
    public void tiroDado() {
        dado1.setValorDado((int)(Math.random() * 6 + 1));
        dado2.setValorDado((int)(Math.random() * 6 + 1));
        dado3.setValorDado((int)(Math.random() * 6 + 1));
    }

    //Tercer Metodo
    public static void main(String[] args){

        JuegoDados juegoDeDados = new JuegoDados();

        juegoDeDados.defineDados();

        int contador = 0;

        do {
            System.out.println(juegoDeDados.dado1.getValorDado()+" - "+juegoDeDados.dado2.getValorDado()+" - "+juegoDeDados.dado3.getValorDado());

            if (juegoDeDados.dado1.getValorDado() == juegoDeDados.dado2.getValorDado() && juegoDeDados.dado1.getValorDado() == juegoDeDados.dado3.getValorDado()){
                System.out.println("Lo has hecho en el intento: "+(contador + 1));
                break;
            } else {
                contador++;
                juegoDeDados.tiroDado();
            }
        } while (true);
    }
}

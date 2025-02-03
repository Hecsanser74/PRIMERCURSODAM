package POO.Ejercicio8;

public class JuegoDados {
    //Perimer metodo
    Dado dado1;
    Dado dado2;
    Dado dado3;

    //Primer metodo
    private void defineDados(Dado dado1, Dado dado2, Dado dado3){
        dado1 = new Dado((int) (Math.random()*6)+1);
        dado2 = new Dado((int) (Math.random()*6)+1);
        dado3 = new Dado((int) (Math.random()*6)+1);
    }

    //Segundo Metodo
    public void tiroDado() {
        dado1.setValorDado((int)(Math.random()+6)+1);
        dado2.setValorDado((int)(Math.random()*6)+1);
        dado3.setValorDado((int)(Math.random()*6)+1);
    }

    //Tercer Metodo
    public void main(String[] args){

        defineDados(dado1, dado2, dado3);

        int contador = 0;

        do {
            System.out.println(dado1.getValorDado()+" - "+dado2.getValorDado()+" - "+dado3.getValorDado());

            if (dado1.getValorDado() == dado2.getValorDado() && dado1.getValorDado() == dado3.getValorDado()){
                System.out.println("Lo has hecho en el intento: "+contador);
            }

            contador++;
        } while (true);
    }
}

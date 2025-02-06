package POO.Ejercicio8;

public class Dado {
    private int valorDado; //Atributo de Dado

    //Getter
    public int getValorDado() {
        return valorDado;
    }

    //Metodo imprime Dado
    public void imprimeDado() {
        System.out.println(valorDado);
    }

    //Setter
    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    //Contructor
    public Dado (int valorDado){
        this.valorDado= valorDado;
    }
}

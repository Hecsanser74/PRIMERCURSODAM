package POO.Ejercicio2;

public class Aire_Acondicionado {
    private String Nombre;
    private int tempMaxima;
    private int tempMinima;
    private int tempActual;

    //Getters
    public String getNombre() {
        return Nombre;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public int getTempActual() {
        return tempActual;
    }

    public int getTempMinima() {
        return tempMinima;
    }

    //Setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    //Constructor
    public Aire_Acondicionado (String Nombre, int tempMaxima, int tempMinima, int tempActual){
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempActual = tempActual;
    }

    //Metodos Subir y bajar temperatura
    public void subirTemperatira (){
        if (tempActual < tempMaxima) tempActual++;
    }

    public void bajarTemperatura (){
        if (tempActual > tempMinima) tempActual--;
    }



    @Override
    public String toString(){
        return "EL aire acondicionado tiene esta temperatura actualmente: "+this.tempActual;
    }
}

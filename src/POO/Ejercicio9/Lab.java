package POO.Ejercicio9;

import java.util.HashSet;
import java.util.Set;

public class Lab {
    private String nombreLab; //Nombre del Laboratorio
    private String taller; //Taller
    private int capMaxima; //Capacidad Maxima
    private  String hora; //Hora
    private String dia; //Dia
    private String profeso; //Peofesor que lo imparte
    private Set<String> estudiantes; //Lista estudiantes

    //Getters
    public int getCapMaxima() {
        return capMaxima;
    }

    public Set<String> getEstudiantes() {
        return estudiantes;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public String getProfeso() {
        return profeso;
    }

    public String getTaller() {
        return taller;
    }

    //Setters
    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public void setProfeso(String profeso) {
        this.profeso = profeso;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public void addEstudiantes(String estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    //Constructor
    public Lab(String nombreLab, String taller, int capMaxima, String hora, String dia, String profeso){
        this.nombreLab = nombreLab;
        this.taller = taller;
        this.capMaxima = capMaxima;
        this.hora = hora;
        this.dia = dia;
        this.profeso = profeso;
        this.estudiantes = new HashSet<>();
    }
}

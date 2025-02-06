package POO.Ejercicio9;
//

public class MainLab {
    public static void main(String[] args) {
        Lab laboratorio1 = new Lab("Laboratorio de Juan", "Talleres de Juan", 50, "17:45", "Viernes", "Juan");

        laboratorio1.addEstudiantes("Pedrito Peña");
        laboratorio1.addEstudiantes("Juana Dearco");
        laboratorio1.addEstudiantes("Paumer Paumo");

        Lab laboratorio2 = new Lab("Laboratorio Pauforesalcora", "PaufoTaller", 43, "12:15", "Lunes", "Paquita");

        laboratorio2.addEstudiantes("Leonardo Nita");
        laboratorio2.addEstudiantes("Xumelo Juan Drago");

        System.out.println("El laboratiorio: "+laboratorio1.getNombreLab()+" Con el taller: "+laboratorio1.getTaller()+" Capacidad maxima: "+laboratorio1.getCapMaxima()+
                " hora de clase: "+laboratorio1.getHora()+" El dia: "+laboratorio1.getDia()+" Impartida por el profesor: "+laboratorio1.getProfeso()+" Y los estudiantes son: ");

        for (String estudiantes : laboratorio1.getEstudiantes()){
            System.out.print(estudiantes+ ", ");
        }

        System.out.println();
        System.out.println("·····································");

        System.out.println("El laboratiorio: "+laboratorio2.getNombreLab()+" Con el taller: "+laboratorio2.getTaller()+" Capacidad maxima: "+laboratorio2.getCapMaxima()+
                " hora de clase: "+laboratorio2.getHora()+" El dia: "+laboratorio2.getDia()+" Impartida por el profesor: "+laboratorio2.getProfeso()+" Y los estudiantes son: ");

        for (String estudiantes : laboratorio2.getEstudiantes()){
            System.out.print(estudiantes+ ", ");
        }

    }
}
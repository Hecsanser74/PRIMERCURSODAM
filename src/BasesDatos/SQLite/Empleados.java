package BasesDatos.SQLite;

import POO.Ejercicio5.Client;
import POO.Herencias.Trabajadores.Empleado;
import org.checkerframework.checker.units.qual.N;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Empleados {
    private String DNI;
    private String Nombre;

    public Empleados(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public static void crearTabla(){

        Connection con = null;
        Statement st = null;

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();

            String sql = "CREATE TABLE Empleados (DNI varchar(9) CONTRAINT DNI PRIMARY KEY, Nombre varchar(30)";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Error al añadir la tabla: " + ex.getMessage());
        }

    }
}

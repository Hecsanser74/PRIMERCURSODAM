package BasesDatos.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLFactura {
    private static final String URL = "jdbc:postgresql://89.36.214.106:5432/f_1cfsy_6860b";
    private static final String USER = "f_1cfsy_6860b";
    private static final String PASSWORD = "f_1cfsy_6860b";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a PostgreSQL");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        connect();
    }
}

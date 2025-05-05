package BasesDatos.Aplicacio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactura2 {
    private static final String URL = "jdbc:postgresql://89.36.214.106:5432/f_1cfsy_6860b";
    private static final String USER = "f_1cfsy_6860b";
    private static final String PASSWORD = "f_1cfsy_6860b";

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


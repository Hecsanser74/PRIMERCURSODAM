package BasesDatos.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://89.36.214.106:5432/geo_1cfsy_6860b";
    private static final String USER = "geo_1cfsy_6860b";
    private static final String PASSWORD = "geo_1cfsy_6860b";

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


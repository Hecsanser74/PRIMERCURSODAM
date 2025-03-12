package BasesDatos.SQLite;

import java.sql.*;
import java.util.Scanner;

public class Clientes {
    private String DNI;
    private String Nombre;

    public Clientes(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public static void crearTabla(){

        Connection con = null;
        Statement st = null;

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();

            String sql = "CREATE TABLE Clientes (DNI varchar(9) CONSTRAINT DNI PRIMARY KEY, Nombre varchar(30))";
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Error al añadir la tabla: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }

    }

    public static void añadirCliente() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI: ");
        String DNI = scanner.nextLine();
        System.out.print("Escribe el Nombre: ");
        String Nombre = scanner.nextLine();

        String sql = "INSERT INTO Clientes (DNI, Nombre) VALUES (?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            st.setString(2, Nombre);
            st.executeUpdate();
            System.out.println("Cliente agregado con éxito.");

        } catch (SQLException ex) {
            System.out.println("Error al agregar el Cliente: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }

    public static void consultarClienteDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del cliente: ");
        String isbn = scanner.nextLine();

        String sql = "SELECT * FROM Clientes WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
            } else {
                System.out.println("No se encontró un cliente con el DNI proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar el cliente: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }
}

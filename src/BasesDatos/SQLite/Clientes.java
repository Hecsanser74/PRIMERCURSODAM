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

    public static void menuClientes() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión - Clientes ===");
            System.out.println("1. Añadir un nuevo cliente");
            System.out.println("2. Consultar un cliente por DNI");
            System.out.println("3. Actualizar un cliente por DNI");
            System.out.println("4. Eliminar un cliente por DNI");
            System.out.println("5. Mostrar todos los clientes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Clientes.añadirCliente();
                    break;
                case 2:
                    Clientes.consultarClienteDNI();
                    break;
                case 3:
                    Clientes.actualizarClientePorDNI();
                    break;
                case 4:
                    Clientes.eliminarClientePorDNI();
                    break;
                case 5:
                    Clientes.mostrarTodosLosClientes();
                    break;
                default:
                    System.out.println("Opcion no valida prueba otra vez.");
            }
        } while (opcion != 0);
    }

    public static void crearTabla() {

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
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
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
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }

    public static void consultarClienteDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del cliente: ");
        String DNI = scanner.nextLine();

        String sql = "SELECT * FROM Clientes WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
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
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }

    public static void actualizarClientePorDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del cliente a actualizar: ");
        String DNI = scanner.nextLine();
        System.out.print("Escribe el nuevo Nombre: ");
        String Nombre = scanner.nextLine();

        String sql = "UPDATE Clientes SET Nombre = ? WHERE DNI = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, Nombre);
            st.setString(2, DNI);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Cliente actualizado con éxito.");
            } else {
                System.out.println("No se encontró un cliente con el DNI proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el cliente: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }

    public static void eliminarClientePorDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del Cliente a eliminar: ");
        String isbn = scanner.nextLine();

        String sql = "DELETE FROM Clientes WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Cliente eliminado con éxito :).");
            } else {
                System.out.println("No se encontró un cliente con el DNI proporcionado :(.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar el cliente: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }
    public static void mostrarTodosLosClientes() {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Clientes";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("=== Lista de Clientes ===");
            while (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("-----------------------------");
            }

        } catch (SQLException ex) {
            System.out.println("Error al mostrar los clientes: " + ex.getMessage());
        }
        finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }
}
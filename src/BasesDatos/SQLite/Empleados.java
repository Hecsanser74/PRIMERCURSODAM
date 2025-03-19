package BasesDatos.SQLite;

import POO.Ejercicio5.Client;
import POO.Herencias.Trabajadores.Empleado;
import org.checkerframework.checker.units.qual.N;

import java.sql.*;
import java.util.Scanner;

public class Empleados {
    private String DNI;
    private String Nombre;

    public Empleados(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public static void menuEmpleados() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión - Empleados ===");
            System.out.println("1. Añadir un nuevo Empleado");
            System.out.println("2. Consultar un empleado por DNI");
            System.out.println("3. Actualizar un empleado por DNI");
            System.out.println("4. Eliminar un empleado por DNI");
            System.out.println("5. Mostrar todos los empleados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirEmpleado();
                    break;
                case 2:
                    consultarEmpleadoDNI();
                    break;
                case 3:
                    actualizarEmpleadoPorDNI();
                    break;
                case 4:
                    eliminarEmpleadoPorDNI();
                    break;
                case 5:
                    mostrarTodosLosEmpleados();
                    break;
                default:
                    System.out.println("Opcion no valida prueba otra vez.");
            }
        } while (opcion != 0);
    }

    public static void crearTabla(){

        Connection con = null;
        Statement st = null;

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();

            String sql = "CREATE TABLE Empleados (DNI varchar(9) CONSTRAINT DNI PRIMARY KEY, Nombre varchar(30))";
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
    public static void añadirEmpleado() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI: ");
        String DNI = scanner.nextLine();
        System.out.print("Escribe el Nombre: ");
        String Nombre = scanner.nextLine();

        String sql = "INSERT INTO Empleados (DNI, Nombre) VALUES (?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            st.setString(2, Nombre);
            st.executeUpdate();
            System.out.println("Empleado agregado con éxito.");

        } catch (SQLException ex) {
            System.out.println("Error al agregar el Empleado: " + ex.getMessage());
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

    public static void consultarEmpleadoDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del empleado: ");
        String DNI = scanner.nextLine();

        String sql = "SELECT * FROM Empleados WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
            } else {
                System.out.println("No se encontró un empleado con el DNI proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar el empleado: " + ex.getMessage());
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

    public static void actualizarEmpleadoPorDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del empleado a actualizar: ");
        String DNI = scanner.nextLine();
        System.out.print("Escribe el nuevo Nombre: ");
        String Nombre = scanner.nextLine();

        String sql = "UPDATE Empleados SET Nombre = ? WHERE DNI = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, Nombre);
            st.setString(2, DNI);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Empleado actualizado con éxito.");
            } else {
                System.out.println("No se encontró un empleado con el DNI proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el empleado: " + ex.getMessage());
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

    public static void eliminarEmpleadoPorDNI() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del empleado a eliminar: ");
        String isbn = scanner.nextLine();

        String sql = "DELETE FROM Empleados WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Empleado eliminado con éxito :).");
            } else {
                System.out.println("No se encontró un empleado con el DNI proporcionado :(.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar el empleado: " + ex.getMessage());
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
    public static void mostrarTodosLosEmpleados() {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Empleados";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("=== Lista de Empleados ===");
            while (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("-----------------------------");
            }

        } catch (SQLException ex) {
            System.out.println("Error al mostrar los empleados: " + ex.getMessage());
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

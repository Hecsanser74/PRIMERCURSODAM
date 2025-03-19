package BasesDatos.SQLite;

import java.sql.*;
import java.util.Scanner;

public class Reservas {
    private String DNICli;
    private String id_reserva;
    private String fechaInicio;
    private String fechaFinal;

    public Reservas(String DNICli, String id_reserva, String fechaFinal, String fechaInicio) {
        this.DNICli = DNICli;
        this.id_reserva = id_reserva;
        this.fechaFinal = fechaFinal;
        this.fechaInicio = fechaInicio;
    }

    public static void menuCReservas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión - Reservas ===");
            System.out.println("1. Añadir una nueva reserva");
            System.out.println("2. Consultar una reserva por ID");
            System.out.println("3. Actualizar una reserva por ID");
            System.out.println("4. Eliminar una reserva por ID");
            System.out.println("5. Imprimir Reserva por ID");
            System.out.println("6. Mostrar todas las reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirReserva();
                    break;
                case 2:
                    consultarReservaID();
                    break;
                case 3:
                    actualizarReservaPorID();
                    break;
                case 4:
                    eliminarReservaPorID();
                    break;
                case 5:
                    imprimirReservaPorID();
                    break;
                case 6:
                    mostrarTodasLasReservas();
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

            String sql = "CREATE TABLE Reservas (ID_reserva varchar(9) CONSTRAINT ID_reserva PRIMARY KEY, DNI_Cliente varchar(30), TituloLibro varchar(30), FechaInicio varchar(30), FechaFinal varchar(30), CONSTRAINT DNI_Cliente FOREIGN KEY (DNI_Cliente) REFERENCES Clientes(DNI), CONSTRAINT TituloLibro FOREIGN KEY (TituloLibro) REFERENCES Biblioteca(Titulo))";
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

    public static void añadirReserva() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI del Cliente: ");
        String DNICli = scanner.nextLine();
        System.out.print("Escribe el nombre del libro: ");
        String libro = scanner.nextLine();
        System.out.print("Escribe el ID de la reserva: ");
        String id_reserva = scanner.nextLine();
        System.out.print("Escribe cuando inicia la reserva: ");
        String fechaInicio = scanner.nextLine();
        System.out.print("Escribe cuando finaliza la reserva: ");
        String fechaFinal = scanner.nextLine();

        String sql = "INSERT INTO Reservas (DNI_Cliente, TituloLibro, ID_reserva, FechaInicio, FechaFinal) VALUES (?, ?, ?, ?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNICli);
            st.setString(2, libro);
            st.setString(3, id_reserva);
            st.setString(4, fechaInicio);
            st.setString(5, fechaFinal);
            st.executeUpdate();
            System.out.println("Reserva agregada con éxito.");

        } catch (SQLException ex) {
            System.out.println("Error al agregar reserva: " + ex.getMessage());
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

    public static void consultarReservaID() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ID de la reserva: ");
        String DNI = scanner.nextLine();

        String sql = "SELECT * FROM Reservas WHERE ID_reserva = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getString("ID_reserva"));
                System.out.println("Cliente: " + rs.getString("DNI_Cliente"));
                System.out.println("Libro: " + rs.getString("TituloLibro"));
                System.out.println("Fecha Inicio: " + rs.getString("FechaInicio"));
                System.out.println("Fecha Final: " + rs.getString("FechaFinal"));
            } else {
                System.out.println("No se encontró una reserva con el ID proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar la reserva: " + ex.getMessage());
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

    public static void actualizarReservaPorID() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ID de reserva a actualizar: ");
        String id_reserva = scanner.nextLine();
        System.out.print("Escribe DNI del nuevo cliente: ");
        String DNICli = scanner.nextLine();
        System.out.print("Escribe nombre del libro: ");
        String libro = scanner.nextLine();
        System.out.print("Escribe nueva fecha Inicio: ");
        String fechaInicio = scanner.nextLine();
        System.out.print("Escribe nueva fecha Final: ");
        String fechaFinal = scanner.nextLine();

        String sql = "UPDATE Reservas SET DNI_Cliente = ?, TituloLibro = ?, FechaInicio = ?, FechaFinal = ?  WHERE ID_reserva = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNICli);
            st.setString(1, libro);
            st.setString(3, fechaInicio);
            st.setString(4, fechaFinal);
            st.setString(5, id_reserva);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Reserva actualizada con éxito.");
            } else {
                System.out.println("No se encontró una reserva con el ID proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al actualizar reserva: " + ex.getMessage());
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

    public static void eliminarReservaPorID() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ID de la reserva a eliminar: ");
        String isbn = scanner.nextLine();

        String sql = "DELETE FROM Reservas WHERE ID_reserva = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Reserva eliminada con éxito :).");
            } else {
                System.out.println("No se encontró una reserva con el ID proporcionado :(.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar reserva: " + ex.getMessage());
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

    public static void mostrarTodasLasReservas() {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Reservas";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("=== Lista de Reservas ===");
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("ID_reserva"));
                System.out.println("Cliente: " + rs.getString("DNI_Cliente"));
                System.out.println("Libro: " + rs.getString("TituloLibro"));
                System.out.println("Fecha Inicio: " + rs.getString("FechaInicio"));
                System.out.println("Fecha Final: " + rs.getString("FechaFinal"));
                System.out.println("-----------------------------");
            }

        } catch (SQLException ex) {
            System.out.println("Error al mostrar reservas: " + ex.getMessage());
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

    public static void imprimirReservaPorID() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID de la reserva: ");
        int reservaID = scanner.nextInt();

        String sql = "SELECT Reservas.ID_reserva, Clientes.Nombre, Clientes.DNI, " +
                "libros.Titulo, libros.Autor, Reservas.FechaInicio, Reservas.FechaFinal " +
                "FROM Reservas " +
                "JOIN Clientes ON Reservas.DNI_Cliente = Clientes.DNI " +
                "JOIN libros ON Reservas.TituloLibro = libros.Titulo " +
                "WHERE Reservas.ID_reserva = ?";

        try (Connection conn = DataBaseConnectionBiblio.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, reservaID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║           DETALLE DE RESERVA          ║");
                System.out.println("╚═══════════════════════════════════════╝");
                System.out.printf("╠ %-15s: %-20s ╣\n", "ID Reserva: ", rs.getString("ID_reserva"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "Cliente: ", rs.getString("Nombre"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "DNI Cliente: ", rs.getString("DNI"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "Libro: ", rs.getString("Titulo"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "Autor: ", rs.getString("Autor"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "Fecha Inicio: ", rs.getString("FechaInicio"));
                System.out.printf("╠ %-15s: %-20s ╣\n", "Fecha Final: ", rs.getString("FechaFinal"));
                System.out.println("╚═══════════════════════════════════════╝");
            } else {
                System.out.println("No se encontró una reserva con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la reserva: " + e.getMessage());
        }
    }
}

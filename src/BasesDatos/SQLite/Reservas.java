package BasesDatos.SQLite;

import javax.swing.*;
import java.awt.*;
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

    public static void añadirReserva(String DNI, String libro, String ID, String fechaInicio, String fechaFinal) {

        Connection con = null;
        PreparedStatement st = null;


        String sql = "INSERT INTO Reservas (DNI_Cliente, TituloLibro, ID_reserva, FechaInicio, FechaFinal) VALUES (?, ?, ?, ?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            st.setString(2, libro);
            st.setString(3, ID);
            st.setString(4, fechaInicio);
            st.setString(5, fechaFinal);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reserva agregada con éxito");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir reserva: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void consultarReservaID(String ID) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "SELECT * FROM Reservas WHERE ID_reserva = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, ID);
            ResultSet rs = st.executeQuery();

            Frame resultado = new JFrame("Detalles Reserva");
            resultado.setLayout(new GridLayout(5, 1));
            resultado.setSize(400, 300);
            resultado.setLocationRelativeTo(null);

            if (rs.next()) {
                resultado.add(new JLabel("ID: " + rs.getString("ID_reserva")));
                resultado.add(new JLabel("DNI Cliente: " + rs.getString("DNI_Cliente")));
                resultado.add(new JLabel("Libro: " + rs.getString("TituloLibro")));
                resultado.add(new JLabel("Fecha Inicio: " + rs.getString("FechaInicio")));
                resultado.add(new JLabel("Fecha Final: " + rs.getString("FechaFinal")));

            } else {
                resultado.add(new JLabel("No se ha encontrado la reserva"));
            }
            resultado.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void actualizarReservaPorID(String ID, String DNI, String libro, String fechaInicio, String fechaFinal) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "UPDATE Reservas SET DNI_Cliente = ?, TituloLibro = ?, FechaInicio = ?, FechaFinal = ?  WHERE ID_reserva = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            st.setString(1, libro);
            st.setString(3, fechaInicio);
            st.setString(4, fechaFinal);
            st.setString(5, ID);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Reserva actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la Reserva.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void eliminarReservaPorID(String ID) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "DELETE FROM Reservas WHERE ID_reserva = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, ID);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Reserva eliminada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la Reserva.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

            JFrame mostrarReservasFrame = new JFrame("Lista de Todas las Reservas");
            mostrarReservasFrame.setSize(800, 600);
            mostrarReservasFrame.setLocationRelativeTo(null);
            mostrarReservasFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
            JScrollPane scrollPane = new JScrollPane(panelPrincipal);
            mostrarReservasFrame.add(scrollPane);

            while (rs.next()) {
                JPanel panelReserva = new JPanel(new GridLayout(0, 2, 10, 5));
                panelReserva.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel labelID = new JLabel("ID Reserva:");
                JLabel valorID = new JLabel(rs.getString("ID_reserva"));

                JLabel labelDNI = new JLabel("DNI Cliente:");
                JLabel valorDNI = new JLabel(rs.getString("DNI_Cliente"));

                JLabel labelLibro = new JLabel("Libro:");
                JLabel valorLibro = new JLabel(rs.getString("TituloLibro"));

                JLabel labelInicio = new JLabel("Fecha Inicio:");
                JLabel valorInicio = new JLabel(rs.getString("FechaInicio"));

                JLabel labelFinal = new JLabel("Fecha Final:");
                JLabel valorFinal = new JLabel(rs.getString("FechaFinal"));

                panelReserva.add(labelID);
                panelReserva.add(valorID);
                panelReserva.add(labelDNI);
                panelReserva.add(valorDNI);
                panelReserva.add(labelLibro);
                panelReserva.add(valorLibro);
                panelReserva.add(labelInicio);
                panelReserva.add(valorInicio);
                panelReserva.add(labelFinal);
                panelReserva.add(valorFinal);

                panelPrincipal.add(panelReserva);
                panelPrincipal.add(new JSeparator(SwingConstants.HORIZONTAL));
            }

            if (!rs.isBeforeFirst()) {
                JLabel noReservas = new JLabel("No hay reservas registradas.");
                noReservas.setHorizontalAlignment(SwingConstants.CENTER);
                panelPrincipal.add(noReservas);
            }

            mostrarReservasFrame.setVisible(true);

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

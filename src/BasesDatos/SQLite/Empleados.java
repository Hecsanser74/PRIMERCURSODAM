package BasesDatos.SQLite;

import POO.Ejercicio5.Client;
import POO.Herencias.Trabajadores.Empleado;
import org.checkerframework.checker.units.qual.N;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class Empleados {
    private String DNI;
    private String Nombre;

    public Empleados(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public static void añadirEmpleado(String DNI, String Nombre) {

        Connection con = null;
        PreparedStatement st = null;
        String sql = "INSERT INTO Empleados (DNI, Nombre) VALUES (?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, DNI);
            st.setString(2, Nombre);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado agregado con éxito");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar empleado: " + ex.getMessage(),
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

    public static void consultarEmpleadoDNI(String DNI) {

        Connection con = null;
        PreparedStatement st = null;
        String sql = "SELECT * FROM Empleados WHERE DNI = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, DNI);
            ResultSet rs = st.executeQuery();

            JFrame resultado = new JFrame("Resultado Consulta");
            resultado.setLayout(new GridLayout(2, 1));
            resultado.setSize(300, 150);
            resultado.setLocationRelativeTo(null);

            if (rs.next()) {
                JLabel lblDNI = new JLabel("DNI: " + rs.getString("DNI"));
                JLabel lblNombre = new JLabel("Nombre: " + rs.getString("Nombre"));
                resultado.add(lblDNI);
                resultado.add(lblNombre);
            } else {
                resultado.add(new JLabel("No se encontró el empleado"));
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

    public static void actualizarEmpleadoPorDNI(String Nombre, String DNI) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "UPDATE Empleados SET Nombre = ? WHERE DNI = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, Nombre);
            st.setString(2, DNI);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Empleado actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Empleado.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void eliminarEmpleadoPorDNI(String DNI) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "DELETE FROM Empleados WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el empleado.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage(),
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

    public static void mostrarTodosLosEmpleados() {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Empleados";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            JFrame mostrarEmpleadosFrame = new JFrame("Lista de Todos los Empleados");
            mostrarEmpleadosFrame.setSize(800, 600);
            mostrarEmpleadosFrame.setLocationRelativeTo(null);
            mostrarEmpleadosFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
            JScrollPane scrollPane = new JScrollPane(panelPrincipal);
            mostrarEmpleadosFrame.add(scrollPane);
            
            while (rs.next()) {
                JPanel panelEmpleado = new JPanel(new GridLayout(0, 2, 10, 5));
                panelEmpleado.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel labelDNI = new JLabel("DNI:");
                JLabel valorDNI = new JLabel(rs.getString("DNI"));

                JLabel labelNombre = new JLabel("Nombre:");
                JLabel valorNombre = new JLabel(rs.getString("Nombre"));

                panelEmpleado.add(labelDNI);
                panelEmpleado.add(valorDNI);
                panelEmpleado.add(labelNombre);
                panelEmpleado.add(valorNombre);

                panelPrincipal.add(panelEmpleado);
                panelPrincipal.add(new JSeparator(SwingConstants.HORIZONTAL));
            }

            if (!rs.isBeforeFirst()) {
                JLabel noEmpleados = new JLabel("No hay reservas registradas.");
                noEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
                panelPrincipal.add(noEmpleados);
            }

            mostrarEmpleadosFrame.setVisible(true);

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

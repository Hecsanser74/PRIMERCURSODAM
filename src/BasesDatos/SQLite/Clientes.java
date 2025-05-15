package BasesDatos.SQLite;

import javax.swing.*;
import java.awt.*;
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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

    public static void añadirCliente(String DNI, String Nombre) {
        Connection con = null;
        PreparedStatement st = null;
        String sql = "INSERT INTO Clientes (DNI, Nombre) VALUES (?, ?)";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, DNI);
            st.setString(2, Nombre);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente agregado con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar cliente: " + ex.getMessage(),
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

    public static void consultarClienteDNI(String DNI) {

        Connection con = null;
        PreparedStatement st = null;
        String sql = "SELECT * FROM Clientes WHERE DNI = ?";

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
                resultado.add(new JLabel("No se encontró el cliente"));
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

    public static void actualizarClientePorDNI(String Nombre, String DNI) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "UPDATE Clientes SET Nombre = ? WHERE DNI = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, Nombre);
            st.setString(2, DNI);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Cliente.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void eliminarClientePorDNI(String DNI) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "DELETE FROM Clientes WHERE DNI = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, DNI);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente.", "Error", JOptionPane.WARNING_MESSAGE);
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
    
    public static void mostrarTodosLosClientes() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Clientes";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            JFrame mostrarClientesFrame = new JFrame("Lista de Todos los Clientes");
            mostrarClientesFrame.setSize(800, 600);
            mostrarClientesFrame.setLocationRelativeTo(null);
            mostrarClientesFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
            JScrollPane scrollPane = new JScrollPane(panelPrincipal);
            mostrarClientesFrame.add(scrollPane);

            while (rs.next()) {
                JPanel panelCliente = new JPanel(new GridLayout(0, 2, 10, 5));
                panelCliente.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel labelDNI = new JLabel("DNI:");
                JLabel valorDNI = new JLabel(rs.getString("DNI"));

                JLabel labelNombre = new JLabel("Nombre:");
                JLabel valorNombre = new JLabel(rs.getString("Nombre"));

                panelCliente.add(labelDNI);
                panelCliente.add(valorDNI);
                panelCliente.add(labelNombre);
                panelCliente.add(valorNombre);

                panelPrincipal.add(panelCliente);
                panelPrincipal.add(new JSeparator(SwingConstants.HORIZONTAL));
            }

            if (!rs.isBeforeFirst()) {
                JLabel noClientes = new JLabel("No hay clientes registrados.");
                noClientes.setHorizontalAlignment(SwingConstants.CENTER);
                panelPrincipal.add(noClientes);
            }

            mostrarClientesFrame.setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los clientes: " + ex.getMessage(),
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
}
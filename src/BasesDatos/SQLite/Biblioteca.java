package BasesDatos.SQLite;

import BasesDatos.SQLite.DataBaseConnectionBiblio;
import EstructurasDatos.Frecuency;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import java.sql.Statement;

public class Biblioteca {


    public static void añadirLibro(String isbn, String titulo, String autor, int AñoPublicacion, int precio) {

        Connection con = null;
        PreparedStatement st = null;


        String sql = "INSERT INTO libros (ISBN, Titulo, Autor, AñoPublicacion, Precio) VALUES (?, ?, ?, ?, ?)";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            st.setString(2, titulo);
            st.setString(3, autor);
            st.setInt(4, AñoPublicacion);
            st.setInt(5, precio);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Libro agregado con éxito");

        } catch (SQLException ex) {
            System.out.println("Error al agregar el libro: " + ex.getMessage());
        }
    }


    public static void consultarLibroPorISBN(String isbn) {

        Connection con = null;
        PreparedStatement st = null;


        String sql = "SELECT * FROM libros WHERE ISBN = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            ResultSet rs = st.executeQuery();

            JFrame MostrarRes = new JFrame("Consulta de Libro");

            MostrarRes.setSize(300, 400);
            MostrarRes.setResizable(true);
            MostrarRes.setLocationRelativeTo(null);
            MostrarRes.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            MostrarRes.setLayout(new GridLayout(4, 1));

            while (rs.next()) {
                JLabel ISBNLibro = new JLabel(rs.getString(1));
                JLabel NombreLibro = new JLabel(rs.getString(2));
                JLabel AñoLibro = new JLabel(String.valueOf(rs.getString(3)));
                JLabel PrecioLibro = new JLabel(String.valueOf(rs.getInt(4)));

                MostrarRes.add(ISBNLibro);
                MostrarRes.add(NombreLibro);
                MostrarRes.add(AñoLibro);
                MostrarRes.add(PrecioLibro);

                MostrarRes.setVisible(true);
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar el libro: " + ex.getMessage());
        }
    }

    public static void actualizarLibroPorISBN(String titulo, String autor, int añoPublicacion, int precio, String isbn) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "UPDATE libros SET Titulo = ?, Autor = ?, AñoPublicacion = ?, Precio = ? WHERE ISBN = ?";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, titulo);
            st.setString(2, autor);
            st.setInt(3, añoPublicacion);
            st.setInt(4, precio);
            st.setString(5, isbn);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Libro actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Libro.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar libro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void eliminarLibroPorISBN(String isbn) {

        Connection con = null;
        PreparedStatement st = null;

        String sql = "DELETE FROM libros WHERE ISBN = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Libro eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Libro.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar libro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void mostrarTodosLosLibros() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM libros";

        try {
            con = DataBaseConnectionBiblio.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            JFrame mostrarLibrosFrame = new JFrame("Lista de Todos los Libros");
            mostrarLibrosFrame.setSize(800, 600);
            mostrarLibrosFrame.setLocationRelativeTo(null);
            mostrarLibrosFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
            JScrollPane scrollPane = new JScrollPane(panelPrincipal);
            mostrarLibrosFrame.add(scrollPane);

            while (rs.next()) {
                JPanel panelLibro = new JPanel(new GridLayout(0, 2, 10, 5));
                panelLibro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel labelISBN = new JLabel("ISBN:");
                JLabel valorISBN = new JLabel(rs.getString("ISBN"));

                JLabel labelTitulo = new JLabel("Título:");
                JLabel valorTitulo = new JLabel(rs.getString("Titulo"));

                JLabel labelAutor = new JLabel("Autor:");
                JLabel valorAutor = new JLabel(rs.getString("Autor"));

                JLabel labelAnio = new JLabel("Año de publicación:");
                JLabel valorAnio = new JLabel(String.valueOf(rs.getInt("AñoPublicacion")));

                JLabel labelPrecio = new JLabel("Precio:");
                JLabel valorPrecio = new JLabel("€" + rs.getInt("Precio"));

                panelLibro.add(labelISBN);
                panelLibro.add(valorISBN);
                panelLibro.add(labelTitulo);
                panelLibro.add(valorTitulo);
                panelLibro.add(labelAutor);
                panelLibro.add(valorAutor);
                panelLibro.add(labelAnio);
                panelLibro.add(valorAnio);
                panelLibro.add(labelPrecio);
                panelLibro.add(valorPrecio);

                panelPrincipal.add(panelLibro);
                panelPrincipal.add(new JSeparator(SwingConstants.HORIZONTAL));
            }

            if (!rs.isBeforeFirst()) {
                JLabel noLibros = new JLabel("No hay libros en la biblioteca.");
                noLibros.setHorizontalAlignment(SwingConstants.CENTER);
                panelPrincipal.add(noLibros);
            }

            mostrarLibrosFrame.setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los libros: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
    }
}

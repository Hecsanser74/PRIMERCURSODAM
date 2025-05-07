package BasesDatos.SQLite;

import BasesDatos.SQLite.DataBaseConnectionBiblio;

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
            System.out.println("Libro agregado con éxito.");

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

            if (rs.next()) {
                System.out.println("ISBN: " + rs.getString("ISBN"));
                System.out.println("Título: " + rs.getString("Titulo"));
                System.out.println("Autor: " + rs.getString("Autor"));
                System.out.println("Año de publicación: " + rs.getInt("AñoPublicacion"));
                System.out.println("Precio: €" + rs.getInt("Precio"));
            } else {
                System.out.println("No se encontró un libro con el ISBN proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar el libro: " + ex.getMessage());
        }
    }

    public static void actualizarLibroPorISBN() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ISBN del libro a actualizar: ");
        String isbn = scanner.nextLine();
        System.out.print("Escribe el nuevo título: ");
        String titulo = scanner.nextLine();
        System.out.print("Escribe el nuevo autor: ");
        String autor = scanner.nextLine();
        System.out.print("Escribe el nuevo año de publicación: ");
        int añoPublicacion = scanner.nextInt();
        System.out.print("Escribe el nuevo precio: ");
        int precio = scanner.nextInt();

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
                System.out.println("Libro actualizado con éxito.");
            } else {
                System.out.println("No se encontró un libro con el ISBN proporcionado.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el libro: " + ex.getMessage());
        }
    }


    public static void eliminarLibroPorISBN() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ISBN del libro a eliminar: ");
        String isbn = scanner.nextLine();

        String sql = "DELETE FROM libros WHERE ISBN = ?";

        try {

            con = DataBaseConnectionBiblio.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, isbn);
            int filasEliminadas = st.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Libro eliminado con éxito :).");
            } else {
                System.out.println("No se encontró un libro con el ISBN proporcionado :(.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar el libro: " + ex.getMessage());
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

            System.out.println("=== Lista de Libros ===");
            while (rs.next()) {
                System.out.println("ISBN: " + rs.getString("ISBN"));
                System.out.println("Título: " + rs.getString("Titulo"));
                System.out.println("Autor: " + rs.getString("Autor"));
                System.out.println("Año de publicación: " + rs.getInt("AñoPublicacion"));
                System.out.println("Precio: €" + rs.getInt("Precio"));
                System.out.println("-----------------------------");
            }

        } catch (SQLException ex) {
            System.out.println("Error al mostrar los libros: " + ex.getMessage());
        }
    }
}
package BasesDatos.Aplicacio;

import BasesDatos.clases.DatabaseConnection;

import java.sql.*;


public class Client {

    private int cod_cli;
    private String nom;
    private String adreca;
    private int cp;
    private int cod_poblacion;

    private Client(int cod_cli, String nom, String adreca, int cp){
        this.cod_cli = cod_cli;
        this.adreca = adreca;
        this.nom = nom;
        this.cp = cp;
    }

    public static void agregarCliente(int cod_cli, String nom, String adreca, int cp, int cod_poblacion){
        PreparedStatement st = null;
        Connection con = null;

        String sql = "INSERT INTO client(cod_cli, nom, adreca, cp, cod_pob) VALUES (?, ?, ?, ?, ?)";

        try {
            con = ConnectionFactura2.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1, cod_cli);
            st.setString(2, nom);
            st.setString(3, adreca);
            st.setInt(4, cp);
            st.setInt(5, cod_poblacion);
            st.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());
        }finally {
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
                System.out.println(" No se ha podido cerrar la conexion");
            }

        }
    }

    public static void listarClientes(){

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionFactura2.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM client");

            System.out.println("cod_cli \tnom \tadreca \tcp \tcod_pob");
            System.out.println();
            System.out.println("--------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.println(rs.getInt(5));
            }
        }catch (SQLException e){
            System.out.println("Se ha producido un error al leer los empleados. Mensaje: " + e.getMessage());
        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el Statement " + ex.getMessage());
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar la conexión." + ex.getMessage());
            }

            try {
                if (rs != null && !rs.isClosed()){
                    rs.close();
                }
            }catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el ResultSet " + ex.getMessage());
            }
        }
    }
}

package BasesDatos.Aplicacio;

import BasesDatos.clases.DatabaseConnection;

import java.sql.*;

public class LiniaFactura {

    private int num_factura;
    private int num_liniafac;
    private int num_articulo;
    private int cantidad;
    private double precio;
    private double descuento;

    public LiniaFactura(int num_factura, int num_liniafac, int num_articulo, int cantidad, double precio, double descuento){

        this.num_factura = num_factura;
        this.num_liniafac = num_liniafac;
        this.num_articulo = num_articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public void agregarArticulo(int num_factura, int num_liniafac, int num_articulo, int cantidad, double precio, double descuento){
        PreparedStatement st = null;
        Connection con = null;

        String sql = "INSERT INTO article(num_f, num_l, cod_a, quant, preu, dte) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            con = ConnectionFactura2.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1, num_factura);
            st.setInt(2, num_liniafac);
            st.setInt(3, num_articulo);
            st.setInt(4, cantidad);
            st.setDouble(5, precio);
            st.setDouble(6, descuento);
            st.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());
        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar el Statement.");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println("No se ha podido cerrar la conexion.");
            }

        }
    }

    public static void listarLiniafactura(){

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionFactura2.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM linia_fac");

            System.out.println("num_f \tnum_l \tcod_a \tquant \tpreu \tdte");
            System.out.println("--------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getInt(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print(rs.getDouble(5) + "\t");
                System.out.println(rs.getDouble(6));
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
                System.out.println(" No se ha producido un error al cerrar la conexión." + ex.getMessage());
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

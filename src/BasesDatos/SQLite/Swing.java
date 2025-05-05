package BasesDatos.SQLite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        //Crear Ventanas
        jFrame.setSize(300, 400);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Ventana Principal");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Crear Botones
        JButton BotonGestionLibro = new JButton("Gestion Libros");
        JButton BotonGestionCliente = new JButton("Gestion Clientes");
        JButton BotonGestionEmpleado = new JButton("Gestion Empleado");
        JButton BotonGestionReservas = new JButton("Gestion Reservas");
        JButton BotonCreacionTablas = new JButton("Creación Tablas");
        JButton BotonSalir = new JButton("Salir");

        //Modificar Botones
        BotonGestionLibro.setSize(200, 200 );
        BotonGestionLibro.addActionListener(e-> {
            JFrame GestLibros = new JFrame("Gestion Libros");
            GestLibros.setSize(200, 200 );
            GestLibros.setVisible(true);
            GestLibros.setBackground(new Color(179, 47, 18));
            GestLibros.setForeground(Color.white);
        });

        BotonGestionLibro.setVisible(true);
        BotonGestionLibro.setBackground(new Color(179, 47, 18));
        BotonGestionLibro.setForeground(Color.white);


        BotonGestionCliente.setSize(200, 200 );
        BotonGestionCliente.setVisible(true);
        BotonGestionCliente.setBackground(new Color(179, 47, 18));
        BotonGestionCliente.setForeground(Color.white);

        BotonGestionEmpleado.setSize(200, 200 );
        BotonGestionEmpleado.setVisible(true);
        BotonGestionEmpleado.setBackground(new Color(179, 47, 18));
        BotonGestionEmpleado.setForeground(Color.white);

        BotonGestionReservas.setSize(200, 200 );
        BotonGestionReservas.setVisible(true);
        BotonGestionReservas.setBackground(new Color(179, 47, 18));
        BotonGestionReservas.setForeground(Color.white);

        BotonCreacionTablas.setSize(200, 200 );
        BotonCreacionTablas.setVisible(true);
        BotonCreacionTablas.setBackground(new Color(179, 47, 18));
        BotonCreacionTablas.setForeground(Color.white);

        BotonSalir.setSize(200, 200 );
        BotonSalir.setVisible(true);
        BotonSalir.setBackground(new Color(179, 47, 18));
        BotonSalir.setForeground(Color.white);


        jFrame.setLayout(new GridLayout(3, 2));

        jFrame.add(BotonGestionLibro);
        jFrame.add(BotonGestionCliente);
        jFrame.add(BotonGestionEmpleado);
        jFrame.add(BotonGestionReservas);
        jFrame.add(BotonCreacionTablas);
        jFrame.add(BotonSalir);
        jFrame.setVisible(true);


    }
}

package BasesDatos.SQLite;

import EstructurasDatos.Anagramas;
import jdk.jshell.ImportSnippet;
import org.checkerframework.checker.units.qual.A;

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
        BotonGestionLibro.addActionListener(_-> {GestLibroMetodo(jFrame);});
        BotonGestionLibro.setVisible(true);

        BotonGestionCliente.setSize(200, 200 );
        BotonGestionCliente.addActionListener(_-> {GestClienteMetodo(jFrame);});
        BotonGestionCliente.setVisible(true);

        BotonGestionEmpleado.setSize(200, 200 );
        BotonGestionEmpleado.addActionListener(_-> {GestEmpleadosMetodo(jFrame);});
        BotonGestionEmpleado.setVisible(true);

        BotonGestionReservas.setSize(200, 200 );
        BotonGestionReservas.addActionListener(_->{GestReservasMetodo(jFrame);});
        BotonGestionReservas.setVisible(true);

        BotonCreacionTablas.setSize(200, 200 );
        BotonCreacionTablas.setVisible(true);

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

    //Metodos
    public static void GestLibroMetodo(JFrame jFrame) {
    JFrame GestLibros = new JFrame("Gestion Libros");
            GestLibros.setSize(300, 400 );
            GestLibros.setLocationRelativeTo(null);
            GestLibros.setBackground(new Color(179, 47, 18));
            GestLibros.setLayout(new GridLayout(3, 2));
            GestLibros.setForeground(Color.white);
            GestLibros.setVisible(true);
            jFrame.setVisible(false);

    JButton AñadirLibro = new JButton("Añadir Libros");
    JButton ConsultarLibros = new JButton("Consultar Libros");
    JButton ActPorISBNLibro = new JButton("Actualizar Libro por ISBN");
    JButton ElimPorISBNLibro = new JButton("Eliminar libro por ISBN");
    JButton MostrarTodos = new JButton("Mostrar Todos");
    JButton BotonVolverLibros = new JButton("Volver");

    AñadirLibro.addActionListener(_-> {AñadirLibro();});

    ConsultarLibros.addActionListener(_-> {ConsultarLibro();});

    BotonVolverLibros.addActionListener(_-> {
          jFrame.setVisible(true);
          GestLibros.setVisible(false);
    });

        GestLibros.add(AñadirLibro);
        GestLibros.add(ConsultarLibros);
        GestLibros.add(ActPorISBNLibro);
        GestLibros.add(ElimPorISBNLibro);
        GestLibros.add(MostrarTodos);
        GestLibros.add(BotonVolverLibros);
}

    public static void AñadirLibro() {
        JFrame AñadirLib = new JFrame("Menu Añadir Libro");
        AñadirLib.setLayout(new GridLayout(6, 2));
        AñadirLib.setSize(600, 600);
        AñadirLib.setResizable(true);
        AñadirLib.setLocationRelativeTo(null);

        JLabel labelLibro2 = new JLabel("Introduce el ISBN del libro: ");
        JTextField campolibro2 = new JTextField("ISBN");
        AñadirLib.add(labelLibro2);
        AñadirLib.add(campolibro2);

        JLabel labelLibro = new JLabel("Introduce el nombre del libro: ");
        JTextField campolibro = new JTextField("Nombre");
        AñadirLib.add(labelLibro);
        AñadirLib.add(campolibro);

        JLabel labelLibro3 = new JLabel("Introduce el nombre del autor: ");
        JTextField campolibro3 = new JTextField("Nombre autor");
        AñadirLib.add(labelLibro3);
        AñadirLib.add(campolibro3);

        JLabel labelLibro4 = new JLabel("Introduce el año de publicación: ");
        JTextField campolibro4 = new JTextField("Año pub");
        AñadirLib.add(labelLibro4);
        AñadirLib.add(campolibro4);

        JLabel labelLibro5 = new JLabel("Introduce el precio: ");
        JTextField campolibro5 = new JTextField("Precio");
        AñadirLib.add(labelLibro5);
        AñadirLib.add(campolibro5);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(98, 157, 12));

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(157, 12, 12));

        AñadirLib.add(BotonSalir);
        AñadirLib.add(BotonEnviar);

        AñadirLib.setVisible(true);

        BotonEnviar.addActionListener(_-> {
            String ISBN = campolibro2.getText();
            String Nombre = campolibro.getText();
            String NombreAut = campolibro3.getText();
            int Año = Integer.parseInt(campolibro4.getText());
            int Precio = Integer.parseInt(campolibro5.getText());

            Biblioteca.añadirLibro(ISBN, Nombre, NombreAut, Año, Precio);
        });
        BotonSalir.addActionListener(_-> {
            AñadirLib.setVisible(false);
        });


    }

    public static void ConsultarLibro() {
        JFrame consultarLibro = new JFrame("Consultar Libro");
        consultarLibro.setLayout(new GridLayout(6, 2));
        consultarLibro.setSize(600, 600);
        consultarLibro.setResizable(true);
        consultarLibro.setLocationRelativeTo(null);

        JLabel labelLibroCons = new JLabel("Introduce el ISBN del libro: ");
        JTextField campolibroCons = new JTextField("ISBN");
        consultarLibro.add(labelLibroCons);
        consultarLibro.add(campolibroCons);
    }
    
    public static void GestClienteMetodo(JFrame jFrame) {
        JFrame GestCli = new JFrame("Gestion Clientes");
        GestCli.setSize(300, 400 );
        GestCli.setLocationRelativeTo(null);
        GestCli.setBackground(new Color(179, 47, 18));
        GestCli.setLayout(new GridLayout(3, 2));
        GestCli.setForeground(Color.white);
        GestCli.setVisible(true);
        jFrame.setVisible(false);

        JButton AñadirCli = new JButton("Añadir Clientes");
        JButton ConsultarCli = new JButton("Consultar Clientes");
        JButton ActPorDNICli = new JButton("Actualizar Cliente por DNI");
        JButton ElimPorDNICli = new JButton("Eliminar Cliente por DNI");
        JButton MostrarTodos = new JButton("Mostrar Todos");
        JButton BotonVolverCli = new JButton("Volver");

        BotonVolverCli.addActionListener(_-> {
            jFrame.setVisible(true);
            GestCli.setVisible(false);
        });

        GestCli.add(AñadirCli);
        GestCli.add(ConsultarCli);
        GestCli.add(ActPorDNICli);
        GestCli.add(ElimPorDNICli);
        GestCli.add(MostrarTodos);
        GestCli.add(BotonVolverCli);
    }

    public static void GestEmpleadosMetodo(JFrame jFrame) {
        JFrame GestEmp = new JFrame("Gestion Empleados");
        GestEmp.setSize(300, 400 );
        GestEmp.setLocationRelativeTo(null);
        GestEmp.setBackground(new Color(179, 47, 18));
        GestEmp.setLayout(new GridLayout(3, 2));
        GestEmp.setForeground(Color.white);
        GestEmp.setVisible(true);
        jFrame.setVisible(false);

        JButton AñadirEmp = new JButton("Añadir Empleados");
        JButton ConsultarEmp = new JButton("Consultar Empleados");
        JButton ActPorDNIEmp = new JButton("Actualizar Empleados por DNI");
        JButton ElimPorDNIEmp = new JButton("Eliminar Empleados por DNI");
        JButton MostrarTodos = new JButton("Mostrar Todos");
        JButton BotonVolverEmp = new JButton("Volver");

        BotonVolverEmp.addActionListener(_-> {
            jFrame.setVisible(true);
            GestEmp.setVisible(false);
        });

        GestEmp.add(AñadirEmp);
        GestEmp.add(ConsultarEmp);
        GestEmp.add(ActPorDNIEmp);
        GestEmp.add(ElimPorDNIEmp);
        GestEmp.add(MostrarTodos);
        GestEmp.add(BotonVolverEmp);
    }

    public static void GestReservasMetodo(JFrame jFrame) {
        JFrame GestReservas = new JFrame("Gestion Reservas");
        GestReservas.setSize(300, 400 );
        GestReservas.setLocationRelativeTo(null);
        GestReservas.setBackground(new Color(179, 47, 18));
        GestReservas.setLayout(new GridLayout(3, 2));
        GestReservas.setForeground(Color.white);
        GestReservas.setVisible(true);
        jFrame.setVisible(false);

        JButton AñadirReservas = new JButton("Añadir Reservas");
        JButton ConsultarReservas = new JButton("Consultar Reservas");
        JButton ActPorDNIReservas = new JButton("Actualizar Reservas por ID");
        JButton ElimPorDNIReservas = new JButton("Eliminar Reservas por ID");
        JButton MostrarTodos = new JButton("Mostrar Todos");
        JButton BotonVolverReservas = new JButton("Volver");

        BotonVolverReservas.addActionListener(_-> {
            jFrame.setVisible(true);
            GestReservas.setVisible(false);
        });

        GestReservas.add(AñadirReservas);
        GestReservas.add(ConsultarReservas);
        GestReservas.add(ActPorDNIReservas);
        GestReservas.add(ElimPorDNIReservas);
        GestReservas.add(MostrarTodos);
        GestReservas.add(BotonVolverReservas);
    }
}

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
        jFrame.setSize(700, 400);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Ventana Principal");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(new Color(230, 230, 230));

        //Crear Botones
        JButton BotonGestionLibro = new JButton("Gestion Libros");
        JButton BotonGestionCliente = new JButton("Gestion Clientes");
        JButton BotonGestionEmpleado = new JButton("Gestion Empleado");
        JButton BotonGestionReservas = new JButton("Gestion Reservas");
        JButton BotonSalir = new JButton("SALIR");

        //Modificar Botones
        BotonGestionLibro.setBackground(new Color(65, 105, 225, 255));
        BotonGestionLibro.setForeground(Color.WHITE);
        BotonGestionLibro.setFont(new Font("Arial", Font.PLAIN, 14));
        BotonGestionLibro.setPreferredSize(new Dimension(150, 50));
        BotonGestionLibro.addActionListener(_-> GestLibroMetodo(jFrame));

        BotonGestionCliente.setBackground(new Color(65, 105, 225));
        BotonGestionCliente.setForeground(Color.WHITE);
        BotonGestionCliente.setFont(new Font("Arial", Font.PLAIN, 14));
        BotonGestionCliente.setPreferredSize(new Dimension(150, 50));
        BotonGestionCliente.addActionListener(_-> GestClienteMetodo(jFrame));

        BotonGestionEmpleado.setBackground(new Color(65, 105, 225));
        BotonGestionEmpleado.setForeground(Color.WHITE);
        BotonGestionEmpleado.setFont(new Font("Arial", Font.PLAIN, 14));
        BotonGestionEmpleado.setPreferredSize(new Dimension(150, 50));
        BotonGestionEmpleado.addActionListener(_-> GestEmpleadosMetodo(jFrame));

        BotonGestionReservas.setBackground(new Color(65, 105, 225));
        BotonGestionReservas.setForeground(Color.WHITE);
        BotonGestionReservas.setFont(new Font("Arial", Font.PLAIN, 14));
        BotonGestionReservas.setPreferredSize(new Dimension(150, 50));
        BotonGestionReservas.addActionListener(_-> GestReservasMetodo(jFrame));


        BotonSalir.setBackground(new Color(220, 60, 60));
        BotonSalir.setForeground(Color.WHITE);
        BotonSalir.setFont(new Font("Arial", Font.BOLD, 16));
        BotonSalir.addActionListener(_ -> System.exit(0));


        jFrame.setLayout(new BorderLayout());

        //Panel de los Botons
        JPanel panelBotones = new JPanel(new GridLayout(2, 2, 10, 10));
        panelBotones.setBackground(new Color(230, 230, 230));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        panelBotones.add(BotonGestionLibro);
        panelBotones.add(BotonGestionCliente);
        panelBotones.add(BotonGestionEmpleado);
        panelBotones.add(BotonGestionReservas);

        jFrame.add(panelBotones, BorderLayout.CENTER);
        jFrame.add(BotonSalir, BorderLayout.SOUTH);

        jFrame.setVisible(true);
    }

    //Metodos
    
    //Metodos de Gestión de Libros
    public static void GestLibroMetodo(JFrame jFrame) {
    JFrame GestLibros = new JFrame("Gestion Libros");
            GestLibros.setSize(700, 400 );
            GestLibros.setLocationRelativeTo(null);
            GestLibros.getContentPane().setBackground(new Color(230, 230, 230));
            GestLibros.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    JButton AñadirLibro = new JButton("Añadir Libros");
    JButton ConsultarLibros = new JButton("Consultar Libros");
    JButton ActPorISBNLibro = new JButton("Actualizar Libro por ISBN");
    JButton ElimPorISBNLibro = new JButton("Eliminar libro por ISBN");
    JButton MostrarTodos = new JButton("Mostrar Todos");
    JButton BotonVolverLibros = new JButton("Volver");

    AñadirLibro.setBackground(new Color(65, 105, 225));
    AñadirLibro.setForeground(Color.WHITE);
    AñadirLibro.setFont(new Font("Arial", Font.PLAIN, 14));
    AñadirLibro.setPreferredSize(new Dimension(150, 50));

    ConsultarLibros.setBackground(new Color(65, 105, 225));
    ConsultarLibros.setForeground(Color.WHITE);
    ConsultarLibros.setFont(new Font("Arial", Font.PLAIN, 14));
    ConsultarLibros.setPreferredSize(new Dimension(150, 50));

    ActPorISBNLibro.setBackground(new Color(65, 105, 225));
    ActPorISBNLibro.setForeground(Color.WHITE);
    ActPorISBNLibro.setFont(new Font("Arial", Font.PLAIN, 14));
    ActPorISBNLibro.setPreferredSize(new Dimension(150, 50));

    ElimPorISBNLibro.setBackground(new Color(65, 105, 225));
    ElimPorISBNLibro.setForeground(Color.WHITE);
    ElimPorISBNLibro.setFont(new Font("Arial", Font.PLAIN, 14));
    ElimPorISBNLibro.setPreferredSize(new Dimension(150, 50));

    MostrarTodos.setBackground(new Color(65, 105, 225));
    MostrarTodos.setForeground(Color.WHITE);
    MostrarTodos.setFont(new Font("Arial", Font.PLAIN, 14));
    MostrarTodos.setPreferredSize(new Dimension(150, 50));

    BotonVolverLibros.setBackground(new Color(220, 60, 60));
    BotonVolverLibros.setForeground(Color.WHITE);
    BotonVolverLibros.setFont(new Font("Arial", Font.BOLD, 16));

    AñadirLibro.addActionListener(_-> {AñadirLibro();});

    ConsultarLibros.addActionListener(_-> {ConsultarLibro();});

    ActPorISBNLibro.addActionListener(_->{ModificarLibro();});

    ElimPorISBNLibro.addActionListener(_->{EliminarLibro();});

    MostrarTodos.addActionListener(_->{MostrarTodos();});

    BotonVolverLibros.addActionListener(_-> {
          jFrame.setVisible(true);
          GestLibros.setVisible(false);
    });


        JPanel panelBotones = new JPanel(new GridLayout(3, 2, 10, 10));
        panelBotones.setBackground(new Color(230, 230, 230));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panelBotones.add(AñadirLibro);
        panelBotones.add(ConsultarLibros);
        panelBotones.add(ActPorISBNLibro);
        panelBotones.add(ElimPorISBNLibro);
        panelBotones.add(MostrarTodos);
        panelBotones.add(BotonVolverLibros);

        GestLibros.add(panelBotones);

        GestLibros.setVisible(true);
        jFrame.setVisible(false);
}

    public static void AñadirLibro() {
        JFrame AñadirLib = new JFrame("Menu Añadir Libro");
        AñadirLib.setSize(600, 600);
        AñadirLib.setLocationRelativeTo(null);
        AñadirLib.getContentPane().setBackground(new Color(230, 230, 230));
        AñadirLib.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel labelLibro2 = new JLabel("Introduce el ISBN del libro: ");
        labelLibro2.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField campolibro2 = new JTextField("ISBN");
        campolibro2.setFont(new Font("Arial", Font.PLAIN, 14));
        AñadirLib.add(labelLibro2);
        AñadirLib.add(campolibro2);

        JLabel labelLibro = new JLabel("Introduce el nombre del libro: ");
        labelLibro.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField campolibro = new JTextField("Nombre");
        campolibro.setFont(new Font("Arial", Font.PLAIN, 14));
        AñadirLib.add(labelLibro);
        AñadirLib.add(campolibro);

        JLabel labelLibro3 = new JLabel("Introduce el nombre del autor: ");
        labelLibro3.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField campolibro3 = new JTextField("Nombre autor");
        campolibro3.setFont(new Font("Arial", Font.PLAIN, 14));
        AñadirLib.add(labelLibro3);
        AñadirLib.add(campolibro3);

        JLabel labelLibro4 = new JLabel("Introduce el año de publicación: ");
        labelLibro4.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField campolibro4 = new JTextField("Año pub");
        campolibro4.setFont(new Font("Arial", Font.PLAIN, 14));
        AñadirLib.add(labelLibro4);
        AñadirLib.add(campolibro4);

        JLabel labelLibro5 = new JLabel("Introduce el precio: ");
        labelLibro5.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField campolibro5 = new JTextField("Precio");
        campolibro5.setFont(new Font("Arial", Font.PLAIN, 14));
        AñadirLib.add(labelLibro5);
        AñadirLib.add(campolibro5);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(149, 229, 100, 189));
        BotonEnviar.setForeground(Color.WHITE);
        BotonEnviar.setFont(new Font("Arial", Font.BOLD, 16));
        BotonEnviar.setPreferredSize(new Dimension(150, 50));;

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(225, 78, 78));
        BotonSalir.setForeground(Color.WHITE);
        BotonSalir.setFont(new Font("Arial", Font.BOLD, 16));
        BotonSalir.setPreferredSize(new Dimension(150, 50));

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
        consultarLibro.setSize(600, 300);
        consultarLibro.setLocationRelativeTo(null);
        consultarLibro.getContentPane().setBackground(new Color(230, 230, 230));
        consultarLibro.setLayout(new GridLayout(3, 2, 10, 10));
        consultarLibro.setResizable(false);

        JLabel labelLibroCons = new JLabel("Introduce el ISBN del libro: ");
        labelLibroCons.setFont(new Font("Arial", Font.PLAIN, 14));

        JTextField campolibroCons = new JTextField("ISBN");
        campolibroCons.setFont(new Font("Arial", Font.PLAIN, 14));

        consultarLibro.add(labelLibroCons);
        consultarLibro.add(campolibroCons);
        consultarLibro.add(new JLabel());
        consultarLibro.add(new JLabel());

        JButton enviarConsulta = new JButton("Consultar Libro");
        enviarConsulta.setBackground(new Color(65, 105, 225));
        enviarConsulta.setForeground(Color.WHITE);
        enviarConsulta.setFont(new Font("Arial", Font.PLAIN, 14));
        enviarConsulta.setPreferredSize(new Dimension(150, 50));

        JButton botonSalir = new JButton("Salir");
        botonSalir.setBackground(new Color(220, 60, 60));
        botonSalir.setForeground(Color.WHITE);
        botonSalir.setFont(new Font("Arial", Font.BOLD, 16));
        botonSalir.setPreferredSize(new Dimension(150, 50));

        consultarLibro.add(enviarConsulta);
        consultarLibro.add(botonSalir);

        enviarConsulta.addActionListener(_-> {
            String LibroConsultado = campolibroCons.getText();

            Biblioteca.consultarLibroPorISBN(LibroConsultado);
        });

        botonSalir.addActionListener(_-> {
            consultarLibro.setVisible(false);
        });

        consultarLibro.setVisible(true);
    }

    public static void ModificarLibro(){
        JFrame ModificarLib = new JFrame("Menu Modificar Libro");
        ModificarLib.setLayout(new GridLayout(4, 2));
        ModificarLib.setSize(600, 400);
        ModificarLib.setResizable(true);
        ModificarLib.setLocationRelativeTo(null);

        JLabel labelLibro2 = new JLabel("Introduce el ISBN del libro: ");
        JTextField campolibro2 = new JTextField("ISBN");
        ModificarLib.add(labelLibro2);
        ModificarLib.add(campolibro2);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(98, 157, 12));

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(157, 12, 12));

        BotonEnviar.addActionListener(_->{

            JFrame actualiLibro = new JFrame("Actualizar libro");
            actualiLibro.setLayout(new GridLayout(6, 2));
            actualiLibro.setSize(600, 600);
            actualiLibro.setResizable(true);
            actualiLibro.setLocationRelativeTo(null);

            JLabel labelLibro = new JLabel("Introduce el nombre del libro: ");
            JTextField campolibro = new JTextField("Nombre");
            actualiLibro.add(labelLibro);
            actualiLibro.add(campolibro);

            JLabel labelLibro3 = new JLabel("Introduce el nombre del autor: ");
            JTextField campolibro3 = new JTextField("Nombre autor");
            actualiLibro.add(labelLibro3);
            actualiLibro.add(campolibro3);

            JLabel labelLibro4 = new JLabel("Introduce el año de publicación: ");
            JTextField campolibro4 = new JTextField();
            actualiLibro.add(labelLibro4);
            actualiLibro.add(campolibro4);

            JLabel labelLibro5 = new JLabel("Introduce el precio: ");
            JTextField campolibro5 = new JTextField();
            actualiLibro.add(labelLibro5);
            actualiLibro.add(campolibro5);

            JButton BotonEnviar1 = new JButton("Enviar");
            BotonEnviar1.setBackground(new Color(98, 157, 12));

            JButton BotonSalir2 = new JButton("Salir");
            BotonSalir2.setBackground(new Color(157, 12, 12));

            BotonEnviar1.addActionListener(_->{
                String LibroTituloModificado = campolibro.getText();
                String NombreAutorModificado = campolibro3.getText();
                int AñoModificado = Integer.parseInt(campolibro4.getText());
                int PrecioModificado = Integer.parseInt(campolibro5.getText());

                Biblioteca.actualizarLibroPorISBN(LibroTituloModificado, NombreAutorModificado, AñoModificado, PrecioModificado, campolibro2.getText());
            });

            actualiLibro.add(BotonEnviar1);
            actualiLibro.add(BotonSalir2);

            actualiLibro.setVisible(true);
        });

        ModificarLib.setVisible(true);

        ModificarLib.add(BotonSalir);
        ModificarLib.add(BotonEnviar);
    }

    public static void EliminarLibro(){
        JFrame EliminarLib = new JFrame("Menu Eliminar Libro");
        EliminarLib.setLayout(new GridLayout(3, 2));
        EliminarLib.setSize(600, 300);
        EliminarLib.setResizable(true);
        EliminarLib.setLocationRelativeTo(null);

        JLabel labelLibro2 = new JLabel("Introduce el ISBN del libro: ");
        JTextField campolibro2 = new JTextField("ISBN");
        EliminarLib.add(labelLibro2);
        EliminarLib.add(campolibro2);

        JButton Eliminar = new JButton("Eliminar pelicula");

        Eliminar.addActionListener(_->{
            String LibroEliminado = campolibro2.getText();

            Biblioteca.eliminarLibroPorISBN(LibroEliminado);
        });

        EliminarLib.add(labelLibro2);
        EliminarLib.add(campolibro2);
        EliminarLib.add(Eliminar);
        EliminarLib.setVisible(true);
    }

    public static void MostrarTodos(){
        Frame MostrarLibros = new JFrame("Mostrar Todos los Libros");
        MostrarLibros.setLayout(new BorderLayout());
        MostrarLibros.setSize(800, 600);
        MostrarLibros.setResizable(true);
        MostrarLibros.setLocationRelativeTo(null);

        JButton botonMostrar = new JButton("Mostrar Libros");
        botonMostrar.addActionListener(_-> {
            Biblioteca.mostrarTodosLosLibros();
        });

        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(_-> {
            MostrarLibros.setVisible(false);
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonMostrar);
        panelBotones.add(botonVolver);

        MostrarLibros.add(panelBotones, BorderLayout.SOUTH);
        MostrarLibros.setVisible(true);
    }
    
    //Metodos de Gestión de Clientes
    public static void GestClienteMetodo(JFrame jFrame) {
        JFrame GestCli = new JFrame("Gestion Clientes");
        GestCli.setSize(700, 400 );
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

        AñadirCli.addActionListener(_-> {AñadirClientes();});

        ConsultarCli.addActionListener(_-> {ConsultarCliente();});

        ActPorDNICli.addActionListener(_->{ModificarCliente();});

        ElimPorDNICli.addActionListener(_->{EliminarCliente();});

        MostrarTodos.addActionListener(_->{MostrarTodosCli();});


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

    public static void AñadirClientes(){
        JFrame AñadirCli = new JFrame("Añadir Cliente");
        AñadirCli.setLayout(new GridLayout(3, 2));
        AñadirCli.setSize(400, 200);
        AñadirCli.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI:");
        JTextField campoDNI = new JTextField();
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField();

        JButton botonEnviar = new JButton("Añadir");
        JButton botonSalir = new JButton("Salir");

        botonEnviar.addActionListener(_-> {
            String DNI = campoDNI.getText();
            String Nombre = campoNombre.getText();
            Clientes.añadirCliente(DNI, Nombre);
        });

        botonSalir.addActionListener(_-> AñadirCli.dispose());

        AñadirCli.add(labelDNI);
        AñadirCli.add(campoDNI);
        AñadirCli.add(labelNombre);
        AñadirCli.add(campoNombre);
        AñadirCli.add(botonEnviar);
        AñadirCli.add(botonSalir);
        AñadirCli.setVisible(true);
    }

    public static void ConsultarCliente(){

        JFrame consultarCli = new JFrame("Consultar Cliente");
        consultarCli.setLayout(new GridLayout(2, 2));
        consultarCli.setSize(400, 150);
        consultarCli.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI del cliente:");
        JTextField campoDNI = new JTextField();
        JButton botonConsultar = new JButton("Consultar");

        botonConsultar.addActionListener(_-> {
            String DNI = campoDNI.getText();
            Clientes.consultarClienteDNI(DNI);
        });

        consultarCli.add(labelDNI);
        consultarCli.add(campoDNI);
        consultarCli.add(botonConsultar);
        consultarCli.setVisible(true);
    }

    public static void ModificarCliente(){
        JFrame ModificarCli = new JFrame("Menu Modificar Clientes");
        ModificarCli.setLayout(new GridLayout(4, 2));
        ModificarCli.setSize(600, 400);
        ModificarCli.setResizable(true);
        ModificarCli.setLocationRelativeTo(null);

        JLabel labelCli2 = new JLabel("Introduce el DNI del cliente: ");
        JTextField campocli2 = new JTextField("DNI");
        ModificarCli.add(labelCli2);
        ModificarCli.add(campocli2);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(98, 157, 12));

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(157, 12, 12));

        BotonEnviar.addActionListener(_->{

            JFrame actualiCli = new JFrame("Actualizar cliente");
            actualiCli.setLayout(new GridLayout(4, 2));
            actualiCli.setSize(600, 600);
            actualiCli.setResizable(true);
            actualiCli.setLocationRelativeTo(null);

            JLabel labelCli = new JLabel("Introduce el nombre del cliente: ");
            JTextField campocli = new JTextField("Nombre");
            actualiCli.add(labelCli);
            actualiCli.add(campocli);

            JButton BotonEnviar1 = new JButton("Enviar");
            BotonEnviar1.setBackground(new Color(98, 157, 12));

            JButton BotonSalir2 = new JButton("Salir");
            BotonSalir2.setBackground(new Color(157, 12, 12));

            BotonEnviar1.addActionListener(_->{
                String ClienteNombreModificado = campocli.getText();

                Clientes.actualizarClientePorDNI(ClienteNombreModificado, campocli2.getText());
            });

            actualiCli.add(BotonEnviar1);
            actualiCli.add(BotonSalir2);

            actualiCli.setVisible(true);
        });

        ModificarCli.setVisible(true);

        ModificarCli.add(BotonSalir);
        ModificarCli.add(BotonEnviar);
    }

    public static void EliminarCliente(){
        JFrame eliminarCli = new JFrame("Menu eliminar Cliente");
        eliminarCli.setLayout(new GridLayout(2, 2));
        eliminarCli.setSize(400, 150);
        eliminarCli.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI del cliente a eliminar:");
        JTextField campoDNI = new JTextField();
        JButton botonEliminar = new JButton("Eliminar");

        botonEliminar.addActionListener(_-> {
            String DNI = campoDNI.getText();

            Clientes.eliminarClientePorDNI(DNI);
        });

        eliminarCli.add(labelDNI);
        eliminarCli.add(campoDNI);
        eliminarCli.add(botonEliminar);
        eliminarCli.setVisible(true);
    }

    public static void MostrarTodosCli(){
        JFrame MostrarClientes = new JFrame("Mostrar Todos los Clientes");
        MostrarClientes.setLayout(new BorderLayout());
        MostrarClientes.setSize(800, 600);
        MostrarClientes.setResizable(true);
        MostrarClientes.setLocationRelativeTo(null);

        JButton botonMostrar = new JButton("Mostrar Clientes");
        botonMostrar.addActionListener(_-> {
            Clientes.mostrarTodosLosClientes();
        });

        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(_-> {
            MostrarClientes.setVisible(false);
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonMostrar);
        panelBotones.add(botonVolver);

        MostrarClientes.add(panelBotones, BorderLayout.SOUTH);
        MostrarClientes.setVisible(true);
    }

    //Metodos de Gestión de Empleados
    public static void GestEmpleadosMetodo(JFrame jFrame) {
        JFrame GestEmp = new JFrame("Gestion Empleados");
        GestEmp.setSize(700, 400 );
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

        AñadirEmp.addActionListener(_-> {AñadirEmpleado();});

        ConsultarEmp.addActionListener(_-> {ConsultarEmpleado();});

        ActPorDNIEmp.addActionListener(_->{ModificarEmpleado();});

        ElimPorDNIEmp.addActionListener(_->{EliminarEmpleado();});

        MostrarTodos.addActionListener(_->{MostrarTodosEmp();});

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
    
    public static void AñadirEmpleado(){
        JFrame AñadirEmp = new JFrame("Añadir Empleado");
        AñadirEmp.setLayout(new GridLayout(3, 2));
        AñadirEmp.setSize(400, 200);
        AñadirEmp.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI:");
        JTextField campoDNI = new JTextField();
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField();

        JButton botonEnviar = new JButton("Añadir");
        JButton botonSalir = new JButton("Salir");

        botonEnviar.addActionListener(_-> {
            String DNI = campoDNI.getText();
            String Nombre = campoNombre.getText();
            Empleados.añadirEmpleado(DNI, Nombre);
        });

        botonSalir.addActionListener(_-> AñadirEmp.dispose());

        AñadirEmp.add(labelDNI);
        AñadirEmp.add(campoDNI);
        AñadirEmp.add(labelNombre);
        AñadirEmp.add(campoNombre);
        AñadirEmp.add(botonEnviar);
        AñadirEmp.add(botonSalir);
        AñadirEmp.setVisible(true);
    }
    
    public static void ConsultarEmpleado(){
        
        JFrame consultarEmp = new JFrame("Consultar Empleado");
        consultarEmp.setLayout(new GridLayout(2, 2));
        consultarEmp.setSize(400, 150);
        consultarEmp.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI del empleado:");
        JTextField campoDNI = new JTextField();
        JButton botonConsultar = new JButton("Consultar");

        botonConsultar.addActionListener(_-> {
            String DNI = campoDNI.getText();

            Empleados.consultarEmpleadoDNI(DNI);
        });

        consultarEmp.add(labelDNI);
        consultarEmp.add(campoDNI);
        consultarEmp.add(botonConsultar);
        consultarEmp.setVisible(true);
    }
    
    public static void ModificarEmpleado(){
        JFrame ModificarEmp = new JFrame("Menu Modificar Empleados");
        ModificarEmp.setLayout(new GridLayout(4, 2));
        ModificarEmp.setSize(600, 400);
        ModificarEmp.setResizable(true);
        ModificarEmp.setLocationRelativeTo(null);

        JLabel labelEmp2 = new JLabel("Introduce el DNI del empleado: ");
        JTextField campoemp2 = new JTextField("DNI");
        ModificarEmp.add(labelEmp2);
        ModificarEmp.add(campoemp2);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(98, 157, 12));

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(157, 12, 12));

        BotonEnviar.addActionListener(_->{

            JFrame actualiEmp = new JFrame("Actualizar empleado");
            actualiEmp.setLayout(new GridLayout(4, 2));
            actualiEmp.setSize(600, 600);
            actualiEmp.setResizable(true);
            actualiEmp.setLocationRelativeTo(null);

            JLabel labelEmp = new JLabel("Introduce el nombre del empleado: ");
            JTextField campoemp = new JTextField("Nombre");
            actualiEmp.add(labelEmp);
            actualiEmp.add(campoemp);

            JButton BotonEnviar1 = new JButton("Enviar");
            BotonEnviar1.setBackground(new Color(98, 157, 12));

            JButton BotonSalir2 = new JButton("Salir");
            BotonSalir2.setBackground(new Color(157, 12, 12));

            BotonEnviar1.addActionListener(_->{
                String EmpleadoNombreModificado = campoemp.getText();

                Empleados.actualizarEmpleadoPorDNI(EmpleadoNombreModificado, campoemp2.getText());
            });

            actualiEmp.add(BotonEnviar1);
            actualiEmp.add(BotonSalir2);

            actualiEmp.setVisible(true);
        });

        ModificarEmp.setVisible(true);

        ModificarEmp.add(BotonSalir);
        ModificarEmp.add(BotonEnviar);
    }
    
    public static void EliminarEmpleado(){
        JFrame eliminarEmp = new JFrame("Menu eliminar Empleado");
        eliminarEmp.setLayout(new GridLayout(2, 2));
        eliminarEmp.setSize(400, 150);
        eliminarEmp.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI del empleado a eliminar:");
        JTextField campoDNI = new JTextField();
        JButton botonEliminar = new JButton("Eliminar");

        botonEliminar.addActionListener(_-> {
            String DNI = campoDNI.getText();

            Empleados.eliminarEmpleadoPorDNI(DNI);
        });

        eliminarEmp.add(labelDNI);
        eliminarEmp.add(campoDNI);
        eliminarEmp.add(botonEliminar);
        eliminarEmp.setVisible(true);
    }
    
    public static void MostrarTodosEmp(){
        JFrame MostrarEmpleados = new JFrame("Mostrar Todos los Empleados");
        MostrarEmpleados.setLayout(new BorderLayout());
        MostrarEmpleados.setSize(800, 600);
        MostrarEmpleados.setResizable(true);
        MostrarEmpleados.setLocationRelativeTo(null);

        JButton botonMostrar = new JButton("Mostrar Empleados");
        botonMostrar.addActionListener(_-> {
            Empleados.mostrarTodosLosEmpleados();
        });

        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(_-> {
            MostrarEmpleados.setVisible(false);
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonMostrar);
        panelBotones.add(botonVolver);

        MostrarEmpleados.add(panelBotones, BorderLayout.SOUTH);
        MostrarEmpleados.setVisible(true);
    }

    //Metodos de Gestión de Reservas
    public static void GestReservasMetodo(JFrame jFrame) {
        JFrame GestReservas = new JFrame("Gestion Reservas");
        GestReservas.setSize(700, 400 );
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

        AñadirReservas.addActionListener(_-> {AñadirReserva();});

        ConsultarReservas.addActionListener(_-> {ConsultarReserva();});

        ActPorDNIReservas.addActionListener(_->{ModificarReserva();});

        ElimPorDNIReservas.addActionListener(_->{EliminarReserva();});

        MostrarTodos.addActionListener(_->{MostrarTodasRes();});

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
    
    public static void AñadirReserva(){
        JFrame AñadirRes = new JFrame("Añadir Reserva");
        AñadirRes.setLayout(new GridLayout(3, 2));
        AñadirRes.setSize(400, 200);
        AñadirRes.setLocationRelativeTo(null);

        JLabel labelDNI = new JLabel("DNI del Cliente:");
        JTextField campoDNI = new JTextField();

        JLabel labelLibro = new JLabel("Título del Libro:");
        JTextField campoLibro = new JTextField();

        JLabel labelID = new JLabel("ID de Reserva:");
        JTextField campoID = new JTextField();

        JLabel labelInicio = new JLabel("Fecha Inicio (dd/mm/aaaa):");
        JTextField campoInicio = new JTextField();

        JLabel labelFinal = new JLabel("Fecha Final (dd/mm/aaaa):");
        JTextField campoFinal = new JTextField();

        JButton botonEnviar = new JButton("Añadir");
        JButton botonSalir = new JButton("Salir");

        botonEnviar.addActionListener(_-> {
            String DNI = campoDNI.getText();
            String libro = campoLibro.getText();
            String ID = campoID.getText();
            String fechaInicio = campoInicio.getText();
            String fechaFinal = campoFinal.getText();

            Reservas.añadirReserva(DNI, libro, ID, fechaInicio, fechaFinal);
        });

        botonSalir.addActionListener(_-> AñadirRes.dispose());

        AñadirRes.add(labelDNI);      AñadirRes.add(campoDNI);
        AñadirRes.add(labelLibro);    AñadirRes.add(campoLibro);
        AñadirRes.add(labelID);       AñadirRes.add(campoID);
        AñadirRes.add(labelInicio);   AñadirRes.add(campoInicio);
        AñadirRes.add(labelFinal);    AñadirRes.add(campoFinal);
        AñadirRes.add(botonEnviar);   AñadirRes.add(botonSalir);
        AñadirRes.setVisible(true);
    }

    public static void ConsultarReserva(){
        JFrame consultarRes = new JFrame("Consultar Reserva");
        consultarRes.setLayout(new GridLayout(2, 2));
        consultarRes.setSize(400, 150);
        consultarRes.setLocationRelativeTo(null);

        JLabel labelID = new JLabel("ID de la Reserva:");
        JTextField campoID = new JTextField();
        JButton botonConsultar = new JButton("Consultar");

        botonConsultar.addActionListener(_-> {
            String ID = campoID.getText();

            Reservas.consultarReservaID(ID);
        });

        consultarRes.add(labelID);
        consultarRes.add(campoID);
        consultarRes.add(botonConsultar);
        consultarRes.setVisible(true);
    }
    
    public static void ModificarReserva(){
        JFrame ModificarRes = new JFrame("Menu Modificar Reserva");
        ModificarRes.setLayout(new GridLayout(3, 2));
        ModificarRes.setSize(600, 300);
        ModificarRes.setResizable(true);
        ModificarRes.setLocationRelativeTo(null);

        JLabel labelRes2 = new JLabel("Introduce el ID de la reserva: ");
        JTextField campores2 = new JTextField("ID");
        ModificarRes.add(labelRes2);
        ModificarRes.add(campores2);

        JButton BotonEnviar = new JButton("Enviar");
        BotonEnviar.setBackground(new Color(98, 157, 12));

        JButton BotonSalir = new JButton("Salir");
        BotonSalir.setBackground(new Color(157, 12, 12));

        BotonEnviar.addActionListener(_->{

            JFrame actualiRes = new JFrame("Actualizar reserva");
            actualiRes.setLayout(new GridLayout(6, 2));
            actualiRes.setSize(600, 400);
            actualiRes.setResizable(true);
            actualiRes.setLocationRelativeTo(null);

            JLabel labelDNI = new JLabel("Nuevo DNI Cliente:");
            JTextField campoDNI = new JTextField();

            JLabel labelLibro = new JLabel("Nuevo Título Libro:");
            JTextField campoLibro = new JTextField();

            JLabel labelInicio = new JLabel("Nueva Fecha Inicio:");
            JTextField campoInicio = new JTextField();

            JLabel labelFinal = new JLabel("Nueva Fecha Final:");
            JTextField campoFinal = new JTextField();

            JButton BotonEnviar1 = new JButton("Enviar");
            BotonEnviar1.setBackground(new Color(98, 157, 12));

            JButton BotonSalir2 = new JButton("Salir");
            BotonSalir2.setBackground(new Color(157, 12, 12));

            BotonEnviar1.addActionListener(_->{
                String DNI = campoDNI.getText();
                String libro = campoLibro.getText();
                String inicio = campoInicio.getText();
                String fin = campoFinal.getText();
                String ID = campores2.getText();

                Reservas.actualizarReservaPorID(ID, DNI, libro, inicio, fin);
            });

            actualiRes.add(labelDNI);
            actualiRes.add(labelLibro);
            actualiRes.add(labelInicio);
            actualiRes.add(labelFinal);
            actualiRes.add(campoDNI);
            actualiRes.add(campoLibro);
            actualiRes.add(campoInicio);
            actualiRes.add(campoFinal);

            actualiRes.add(BotonEnviar1);
            actualiRes.add(BotonSalir2);

            actualiRes.setVisible(true);
        });

        ModificarRes.add(BotonSalir);
        ModificarRes.add(BotonEnviar);

        ModificarRes.setVisible(true);
    }
    
    public static void EliminarReserva(){
        JFrame eliminarRes = new JFrame("Menu eliminar Reserva");
        eliminarRes.setLayout(new GridLayout(2, 2));
        eliminarRes.setSize(400, 150);
        eliminarRes.setLocationRelativeTo(null);

        JLabel labelID = new JLabel("ID de la reserva a eliminar:");
        JTextField campoID = new JTextField();
        JButton botonEliminar = new JButton("Eliminar");

        botonEliminar.addActionListener(_-> {
            String ID = campoID.getText();

            Reservas.eliminarReservaPorID(ID);
        });

        eliminarRes.add(labelID);
        eliminarRes.add(campoID);
        eliminarRes.add(botonEliminar);
        eliminarRes.setVisible(true);
    }
    
    public static void MostrarTodasRes(){
        JFrame MostrarReservas = new JFrame("Mostrar Todas las Reservas");
        MostrarReservas.setLayout(new BorderLayout());
        MostrarReservas.setSize(800, 600);
        MostrarReservas.setResizable(true);
        MostrarReservas.setLocationRelativeTo(null);

        JButton botonMostrar = new JButton("Mostrar Reservas");
        botonMostrar.addActionListener(_-> {
            Reservas.mostrarTodasLasReservas();
        });

        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(_-> {
            MostrarReservas.setVisible(false);
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonMostrar);
        panelBotones.add(botonVolver);

        MostrarReservas.add(panelBotones, BorderLayout.SOUTH);
        MostrarReservas.setVisible(true);
    }
}

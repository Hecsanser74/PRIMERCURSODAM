package GUI.Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ElDestructor {
    private static int contador = 1;
    private static final List<JFrame> galletas = new ArrayList<>();

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton botonCaos = new JButton("Crear Caos");
        JButton eliminarUna = new JButton("Eliminar Una");
        List<JFrame> galletas = new ArrayList<>();

        jFrame.setSize(300, 400);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setTitle("El Destructor");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        jFrame.setLayout(layout);

        jFrame.add(botonCaos);
        jFrame.add(eliminarUna);

        JButton jButton = new JButton();

        botonCaos.addActionListener( e -> crearVentanaHija());
        eliminarUna.addActionListener(e -> eliminarUltima());

        botonCaos.setBackground(Color.orange);
        eliminarUna.setBackground(Color.yellow);

        }

        private static void crearVentanaHija() {
        JFrame galleta = new JFrame("Galleta" + contador);
        galleta.setSize(250, 250);

         JButton autodestruir = new JButton("Autodestruir todas");
         autodestruir.setSize(200, 200 );
         autodestruir.setVisible(true);
         autodestruir.setBackground(new Color(179, 47, 18));
         autodestruir.setForeground(Color.white);

         galleta.add(autodestruir);

            autodestruir.addActionListener(e -> {
                for (JFrame f : galletas){
                    f.dispose();
                }
                galletas.clear();
                JOptionPane.showMessageDialog(null, "Se han eliminado todas las galletas");
            });

            galletas.add(galleta);
            galleta.setVisible(true);
            contador++;
    }

    private static void eliminarUltima() {
        if (!galletas.isEmpty()) {
            galletas.getLast().dispose();
            galletas.removeLast();
        }
    }
}

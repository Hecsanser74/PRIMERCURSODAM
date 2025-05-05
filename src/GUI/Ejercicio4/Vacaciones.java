package GUI.Ejercicio4;

import javax.swing.*;
import java.awt.*;

public class Vacaciones {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Vacaciones a la Vista");
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        String[] opciones = {"Grupo de Viaje", "Viajero Solitario"};
        JComboBox<String> selector = new JComboBox<>(opciones);
        selector.setBackground(new Color(255, 228, 181));
        selector.setForeground(Color.DARK_GRAY);

        JPanel panelGrupo = new JPanel(new GridLayout(4, 2));
        panelGrupo.setBackground(new Color(204, 255, 229));

        JTextField destinoGrupo = new JTextField();
        JTextField nombrePlan = new JTextField();
        JTextField responsable = new JTextField();
        JButton crearGrupo = new JButton("¡Vamos de viaje!");

        destinoGrupo.setBackground(Color.WHITE);
        nombrePlan.setBackground(Color.WHITE);
        responsable.setBackground(Color.WHITE);
        crearGrupo.setBackground(new Color(255, 204, 153));

        panelGrupo.add(new JLabel("Destino:"));
        panelGrupo.add(destinoGrupo);
        panelGrupo.add(new JLabel("Nombre del plan:"));
        panelGrupo.add(nombrePlan);
        panelGrupo.add(new JLabel("Responsable:"));
        panelGrupo.add(responsable);
        panelGrupo.add(crearGrupo);

        JPanel panelSolitario = new JPanel(new GridLayout(4, 2));
        panelSolitario.setBackground(new Color(255, 242, 204));

        JTextField tipoPlan = new JTextField();
        JTextField nombre = new JTextField();
        JTextField nacimiento = new JTextField();
        JTextField altura = new JTextField();
        JTextField equipaje = new JTextField();
        JTextField destino = new JTextField();
        JButton reservar = new JButton("Reservar");

        tipoPlan.setBackground(Color.WHITE);
        nombre.setBackground(Color.WHITE);
        nacimiento.setBackground(Color.WHITE);
        altura.setBackground(Color.WHITE);
        equipaje.setBackground(Color.WHITE);
        destino.setBackground(Color.WHITE);
        reservar.setBackground(new Color(204, 229, 255));

        panelSolitario.add(new JLabel("Tipo de plan:"));
        panelSolitario.add(tipoPlan);
        panelSolitario.add(new JLabel("Nombre:"));
        panelSolitario.add(nombre);
        panelSolitario.add(new JLabel("Año nacimiento:"));
        panelSolitario.add(nacimiento);
        panelSolitario.add(new JLabel("Altura (cm):"));
        panelSolitario.add(altura);
        panelSolitario.add(new JLabel("Equipaje (kg):"));
        panelSolitario.add(equipaje);
        panelSolitario.add(new JLabel("Destino:"));
        panelSolitario.add(destino);
        panelSolitario.add(reservar);

        JPanel panelContenedor = new JPanel(new CardLayout());
        panelContenedor.add(panelGrupo, "Grupo de Viaje");
        panelContenedor.add(panelSolitario, "Viajero Solitario");

        ventana.add(selector, BorderLayout.NORTH);
        ventana.add(panelContenedor, BorderLayout.CENTER);
        ventana.setVisible(true);

        CardLayout cl = (CardLayout) panelContenedor.getLayout();
        selector.addActionListener(e -> cl.show(panelContenedor, (String) selector.getSelectedItem()));

        crearGrupo.addActionListener(e -> {
            String info = "GrupoViaje -> Destino: " + destinoGrupo.getText() + ", Plan: " + nombrePlan.getText() + ", Responsable: " + responsable.getText();
            System.out.println(info);
        });

        reservar.addActionListener(e -> {
            String info = "ViajeroSolitario -> Tipo: " + tipoPlan.getText() + ", Nombre: " + nombre.getText() +
                    ", Nacimiento: " + nacimiento.getText() + ", Altura: " + altura.getText() +
                    ", Equipaje: " + equipaje.getText() + ", Destino: " + destino.getText();
            System.out.println(info);
        });
    }
}

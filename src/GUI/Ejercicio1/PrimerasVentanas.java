package GUI.Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerasVentanas {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JFrame jFrame2 = new JFrame();

        jFrame.setSize(300, 400);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setTitle("Ventana Principal");

        jFrame2.setSize(300, 400);
        jFrame2.setResizable(true);
        jFrame2.setLocationRelativeTo(null);
        jFrame2.setVisible(true);
        jFrame2.setTitle("Ventana Secundaria");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Abrir la ventana secundaria");

        jButton.setVisible(true);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame2.setVisible(true);
            }
        });
        JTextField textFile = new JTextField("   ESTA ES LA VENTANA SECUNDARIA");

        jFrame2.add(textFile);
    }
}

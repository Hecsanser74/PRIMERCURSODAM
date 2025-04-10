package GUI.Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaTexto {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();

        StringBuilder sBuilder = new StringBuilder();

        jFrame.setSize(300, 400);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setTitle("Ventana Principal");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea jText = new JTextArea();
        jText.setEditable(false);

        jText.setVisible(true);

        jFrame.add(jText);

        while (true){
            String texto = JOptionPane.showInputDialog(null, "Introduce texto a intoducir (FIN para terminar): ");
            if (texto == null || texto.equalsIgnoreCase("FIN")) {
                break;
            }
            sBuilder.append("- ").append(texto).append("\n");
            jText.setText(sBuilder.toString());
        }
        JOptionPane.showMessageDialog(null, "Finalizado");
    }
}

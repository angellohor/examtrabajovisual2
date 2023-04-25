package paq1;

import paqG07.contenedor;
import javax.swing.*;
import javax.swing.*;

public class aduanas extends JFrame {
    private JTextArea Infocontenedores;
    private JPanel panel1;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public aduanas(String datos) {
        setContentPane(panel1);
        setTitle("Informacion de contenedores");
        setSize(700, 400);
        Infocontenedores.setText(datos);

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
    }
}

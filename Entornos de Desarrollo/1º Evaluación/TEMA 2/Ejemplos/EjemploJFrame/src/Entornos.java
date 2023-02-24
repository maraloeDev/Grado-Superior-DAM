import javax.swing.*;
import java.awt.*;

public class Entornos extends JFrame {

    public Entornos() throws HeadlessException {

        JLabel l = new JLabel("Mi primer Proyecto");
        this.add(l);
        this.setSize(300, 300);
        this.setTitle("Hola");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Entornos frame = new Entornos();

    }
}



import java.awt.EventQueue;
import javax.swing.JFrame;

import Model.Halaman;

public class Layar extends JFrame {

    public Layar() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Halaman());
        
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Layar();
            ex.setVisible(true);
        });
    }
}
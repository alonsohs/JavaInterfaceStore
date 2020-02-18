import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame {
    public MainInterface(){
        PanelProducto producto1 = new PanelProducto();
        add(producto1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MainInterface marco = new MainInterface();
        marco.setSize(1200, 720);
        marco.setVisible(true);
        marco.setExtendedState(6);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

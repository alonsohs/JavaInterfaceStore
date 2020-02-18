import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame {
    public MainInterface(){
        PanelProducto producto1 = new PanelProducto("iPhone 11", "Imagenes/iphone11.png", "17, 000");
        PanelProducto producto2 = new PanelProducto("Huawei P30", "Imagenes/huaweip30.png", "24,000");
        PanelProducto producto3 = new PanelProducto("Samsung S20", "Imagenes/samsungs20.png", "22,000" );
        JPanel panelBuscador = new JPanel();
        panelBuscador.setBackground(new Color(48, 63,159));
        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new GridLayout(1,3));
        panelResultados.add(producto1, BorderLayout.CENTER);
        panelResultados.add(producto2, BorderLayout.CENTER);
        panelResultados.add(producto3, BorderLayout.CENTER);

        add(panelBuscador, BorderLayout.NORTH);
        add(panelResultados);
    }

    public static void main(String[] args) {
        MainInterface marco = new MainInterface();
        marco.setSize(1200, 720);
        marco.setVisible(true);
        marco.setExtendedState(6);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

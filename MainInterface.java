import javax.swing.*;
import java.awt.*;

/* Interfaz grafica creada para la clase de Programación II
*  Hecha por: -Alonso Hernández Sastré
*             -Omar Valencia Diaz
*             -Ximena Chacón Rojas
*             -Valeria Luna Galicia
*             -Efren Montiel Torres
* Fecha:  23-02-2020
* */

public class MainInterface extends JFrame {
    public MainInterface(){
        super("Interfaz gráfica");
        PanelProducto producto1 = new PanelProducto("iPhone 11", "Imagenes/iphone11.png", "17, 000");
        PanelProducto producto2 = new PanelProducto("Huawei P30", "Imagenes/huaweip30.png", "24,000");
        PanelProducto producto3 = new PanelProducto("Samsung S20", "Imagenes/samsungs20.png", "22,000" );
        PanelBuscador buscador = new PanelBuscador();
        JPanel panelProductos = new JPanel();
        panelProductos.setLayout(new GridLayout(1,3));
        panelProductos.add(producto1, BorderLayout.CENTER);
        panelProductos.add(producto2, BorderLayout.CENTER);
        panelProductos.add(producto3, BorderLayout.CENTER);

        JPanel panelBuscador = new JPanel();
        panelBuscador.setLayout(new GridLayout(1,3));
        JPanel panelVacio = new JPanel();
        panelVacio.setBackground( new Color(48, 63,159 ));
        JPanel panelVacio2 = new JPanel();
        panelVacio2.setBackground( new Color(48, 63,159 ));
        panelBuscador.add(panelVacio);
        panelBuscador.add(buscador);
        panelBuscador.add(panelVacio2);


        JPanel marcoFinal = new JPanel();
        marcoFinal.setLayout(new BoxLayout(marcoFinal, BoxLayout.Y_AXIS));
        marcoFinal.add(panelBuscador);
        marcoFinal.add(panelProductos);
        Dimension dimension = new Dimension(1200,800) ;
        marcoFinal.setPreferredSize(dimension);
        JScrollPane scroll = new JScrollPane(marcoFinal);
        add(scroll);
    }

    public static void main(String[] args) {
        MainInterface marco = new MainInterface();
        marco.setSize(1200, 720);
        marco.setVisible(true);
        marco.setExtendedState(6);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

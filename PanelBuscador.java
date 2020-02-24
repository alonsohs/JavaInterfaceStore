import javax.swing.*;
import java.awt.*;

public class PanelBuscador extends JPanel {

        JTextField textoBuscador = new JTextField();

    public PanelBuscador(){
        Color backgroung = new Color(48, 63,159 );

        textoBuscador.setText("Ingresa el nombre de un producto...");
        textoBuscador.setFont( new Font("Gill sans", Font.PLAIN, 15));
        textoBuscador.setBackground(new Color(152, 183, 215, 255));

        JComboBox listaCategorias;
        String categorias [] = {"Celulares", "Laptops", "Videojuegos", "Pantallas", "Wearables"};
        listaCategorias = new JComboBox(categorias);
        listaCategorias.setFont(new Font("Helvetica", Font.PLAIN,15));
        listaCategorias.setBackground(new Color(152, 183, 215, 255));

         JButton botonBuscar  =new JButton(new ImageIcon(getClass().getResource("Imagenes/botonBuscar.png")));
        botonBuscar.setOpaque(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setBorderPainted(false);

        setLayout(new GridLayout(3,1, 0, 10));
        add(textoBuscador, BorderLayout.CENTER);
        add(listaCategorias, BorderLayout.CENTER);
        add(botonBuscar,BorderLayout.CENTER);
        setBackground(backgroung);
    }

}

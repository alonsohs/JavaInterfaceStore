import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {

    JLabel nombreProducto = new JLabel();
    JLabel imagenProducto;
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton rb1, rb2, rb3;
    JLabel etiquetaPrecio;
    JCheckBox seguroCompra;
    JButton botonComprar ;

    public PanelProducto(){
        Color backgroung = new Color(53, 53, 53 );

        nombreProducto.setText("IPhone 11");
        nombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
        nombreProducto.setFont(new Font("Helvetica", Font.BOLD, 35));
        nombreProducto.setForeground(Color.white);

        imagenProducto = new JLabel(new ImageIcon(getClass().getResource("Imagenes/iphone11.png")));

        Font radioButton = new Font("Gill sans", Font.PLAIN, 16);
        rb1 = new JRadioButton("Color Dorado - 64GB", true);
        rb1.setFont(radioButton);
        rb1.setBackground(backgroung);
        rb1.setForeground(Color.white);
        buttonGroup.add(rb1);
        rb2 = new JRadioButton("Color Verde - 128GB", false);
        rb2.setFont(radioButton);
        rb2.setBackground(backgroung);
        rb2.setForeground(Color.white);
        buttonGroup.add(rb2);
        rb3 = new JRadioButton("Color Rojo - 512GB", false);
        rb3.setFont(radioButton);
        rb3.setBackground(backgroung);
        rb3.setForeground(Color.white);
        buttonGroup.add(rb3);

        etiquetaPrecio = new JLabel("$ 17,000", SwingConstants.CENTER);
        etiquetaPrecio.setFont(new Font("Helvetica", Font.BOLD, 30));
        etiquetaPrecio.setForeground(Color.white);

        seguroCompra = new JCheckBox("Incluir seguro de compra", false);
        seguroCompra.setFont(new Font("Helvetica", Font.PLAIN, 10));
        seguroCompra.setBackground(backgroung);
        seguroCompra.setForeground(Color.white);

        botonComprar = new JButton(new ImageIcon(getClass().getResource("Imagenes/botonCarrito.png")));
        botonComprar.setOpaque(false);
        botonComprar.setContentAreaFilled(false);
        botonComprar.setBorderPainted(false);

        Box caja = Box.createVerticalBox();
        caja.add(Box.createVerticalStrut(10));
        caja.add(nombreProducto);
        caja.add(Box.createVerticalStrut(15));
        caja.add(imagenProducto);
        caja.add(Box.createVerticalStrut(15));
        caja.add(rb1);
        caja.add(rb2);
        caja.add(rb3);
        caja.add(Box.createVerticalStrut(15));
        caja.add(etiquetaPrecio);
        caja.add(Box.createVerticalStrut(20));
        caja.add(seguroCompra);
        caja.add(Box.createVerticalStrut(5));
        caja.add(botonComprar);
        caja.setAlignmentX(Component.CENTER_ALIGNMENT);

        setBackground(backgroung);
        add(caja);
    }
}

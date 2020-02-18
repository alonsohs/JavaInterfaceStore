import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {

    JLabel nombreProducto = new JLabel();
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton rb1, rb2, rb3;
    JLabel etiquetaPrecio;
    JCheckBox seguroCompra;
    JButton botonComprar = new JButton();

    public PanelProducto(){
        nombreProducto.setText("IPhone 11");
        nombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
        nombreProducto.setFont(new Font("Helvetica", Font.BOLD, 24));

        Font radioButton = new Font("Gill sans", Font.PLAIN, 16);
        rb1 = new JRadioButton("Color Dorado - 64GB", true);
        rb1.setFont(radioButton);
        buttonGroup.add(rb1);
        rb2 = new JRadioButton("Color Verde - 128GB", false);
        rb2.setFont(radioButton);
        buttonGroup.add(rb2);
        rb3 = new JRadioButton("Color Rojo - 512GB", false);
        rb3.setFont(radioButton);
        buttonGroup.add(rb3);

        etiquetaPrecio = new JLabel("$ 17,000", SwingConstants.CENTER);
        etiquetaPrecio.setFont(new Font("Helvetica", Font.BOLD, 20));

        seguroCompra = new JCheckBox("Incluir seguro de compra", false);
        seguroCompra.setFont(new Font("Helvetica", Font.PLAIN, 10));

        botonComprar.setText("Agregar al carrito");
        botonComprar.setFont(new Font("Helvetica", Font.PLAIN, 16));

        Box caja = Box.createVerticalBox();
        caja.add(Box.createVerticalStrut(10));
        caja.add(nombreProducto, CENTER_ALIGNMENT);
        caja.add(Box.createVerticalStrut(15));
        caja.add(rb1);
        caja.add(rb2);
        caja.add(rb3);
        caja.add(Box.createVerticalStrut(15));
        caja.add(etiquetaPrecio,CENTER_ALIGNMENT);
        caja.add(Box.createVerticalStrut(20));
        caja.add(seguroCompra,CENTER_ALIGNMENT);
        caja.add(Box.createVerticalStrut(5));
        caja.add(botonComprar, CENTER_ALIGNMENT);

        add(caja);
    }
}

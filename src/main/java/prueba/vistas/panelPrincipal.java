package prueba.vistas;




import lombok.extern.java.Log;

import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

@Log
public class panelPrincipal extends JFrame{
    private JPanel panelRaiz;
    private JLabel Titulo;
    private JCheckBox caja1;
    private JCheckBox caja2;
    private JCheckBox caja3;
    private JButton boton1;

    public panelPrincipal(){
        GraphicsEnvironment environment=GraphicsEnvironment.getLocalGraphicsEnvironment();
        Arrays.stream(environment.getAvailableFontFamilyNames()).forEach(font->log.info(font));
        log.info("Se rendereiza el cuadro de dialogo");
        JOptionPane.showConfirmDialog(this,"Mensaje de pruba");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Primera prueba swing");
        setSize(screenSize.width,screenSize.height);
        panelRaiz=new JPanel();
        Titulo=new JLabel("Prueba de Swing");
        panelRaiz.add(Titulo);
        caja1=new JCheckBox();
        caja2=new JCheckBox();
        caja3=new JCheckBox();
        panelRaiz.add(caja1);
        panelRaiz.add(caja2);
        panelRaiz.add(caja3);
        boton1=new JButton("Ok");
        panelRaiz.add(boton1);
        add(panelRaiz);

        panelRaiz.setVisible(true);

    }
}

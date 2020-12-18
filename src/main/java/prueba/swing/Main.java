package prueba.swing;

import prueba.vistas.panelPrincipal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        panelPrincipal miVentana=new panelPrincipal();
        miVentana.setVisible(true);
    }
}

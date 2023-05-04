package sockets.cliente.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaCliente extends JFrame {

    public VentanaCliente() throws HeadlessException {
        setBounds(600, 300, 250, 350);
        setAlwaysOnTop(true);         // para que siempre este visible en primer plano
        setLocationRelativeTo(null);  // para que aparezca centrada en la pantalla
      //  setUndecorated(true);         // quita el decorado para poder utilizar la opacidad
      //  setOpacity(0.9f);             // porcentaje de transparencia
        PanelCliente ContenedorDentroVentana = new PanelCliente();
        add(ContenedorDentroVentana);
        setVisible(true);
    }
}

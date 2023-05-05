package sockets.cliente.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaCliente extends JFrame {

    public VentanaCliente() throws HeadlessException {
        setTitle("Chat123");
        setBounds(600, 200, 240, 320);
        setAlwaysOnTop(true);         // para que siempre este visible en primer plano
        setLocationRelativeTo(null);  // para que aparezca centrada en la pantalla
     //   setUndecorated(true);         // quita el decorado para poder utilizar la opacidad
     //   setOpacity(0.8f);             // porcentaje de transparencia
        PanelCliente ContenedorDentroVentana = new PanelCliente();
        add(ContenedorDentroVentana);
        setVisible(true);
    }
}
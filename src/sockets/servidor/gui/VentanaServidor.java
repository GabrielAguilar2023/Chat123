package sockets.servidor.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaServidor extends JFrame {

    private PanelServidor contenedorDelServidor;

    public VentanaServidor() throws HeadlessException {
        setTitle("Chat123");
        setBounds(600, 200, 240, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contenedorDelServidor = new PanelServidor();
        add(contenedorDelServidor);
        setVisible(true);
    }
    public void setContenedorDelServidor(String dato) {
        this.contenedorDelServidor.agregarTexto(dato);
    }



}

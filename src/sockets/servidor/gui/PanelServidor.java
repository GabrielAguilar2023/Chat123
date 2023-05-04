package sockets.servidor.gui;

import javax.swing.*;
import java.awt.*;

public class PanelServidor extends JPanel {

 	private JTextArea areaTexto;

//********** CONSTRUCTOR ***********
    public PanelServidor(){
        areaTexto = new JTextArea();
        setLayout(new BorderLayout());
        add (areaTexto,BorderLayout.CENTER);
    }

    public void agregarTexto (String dato) {
        this.areaTexto.append(dato);

    }
}





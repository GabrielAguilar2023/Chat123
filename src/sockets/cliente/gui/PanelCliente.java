package sockets.cliente.gui;

import sockets.cliente.logica.Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static sockets.cliente.logica.ConexionAlServidor.*;


public class PanelCliente extends JPanel {

    private JTextField textoTransmitir;
    private JButton botonEnviar;
    private JButton botonSalir;
    private JTextArea areaTexto;
    private JTextField textoNick;
    private JTextField textoIP;


//**** CONSTRUCTOR ********
    public PanelCliente() {

        textoNick = new JTextField(5);
        add(textoNick);

        JLabel nombreVentana = new JLabel("CLIENTE");
        add(nombreVentana);

        textoIP = new JTextField(8);
        add(textoIP);

        areaTexto = new JTextArea(12,20);
        add(areaTexto);

        textoTransmitir = new JTextField(20);
        add(textoTransmitir);

        botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(new eventoEnviar());
        add(botonEnviar);

        botonSalir = new JButton("Salir");
        botonSalir.addActionListener(new eventoSalir());
        add(botonSalir);
    }

//************ Eventos **************
    public class eventoEnviar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Paquete paqueteEnviarAlServidor = new Paquete(textoNick.getText(),textoIP.getText(),textoTransmitir.getText());
            enviarDatoAlServidor(paqueteEnviarAlServidor);
        }
    }
    public class eventoSalir implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            cerrarVentana();
        }
    }
}

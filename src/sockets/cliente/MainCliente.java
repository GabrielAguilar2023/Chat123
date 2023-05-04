package sockets.cliente;

import sockets.cliente.gui.VentanaCliente;

import javax.swing.*;

public class MainCliente {

        public static void main(String[] args) {
            VentanaCliente ventanaCliente = new VentanaCliente();
            ventanaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
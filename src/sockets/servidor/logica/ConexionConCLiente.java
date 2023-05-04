package sockets.servidor.logica;

import sockets.cliente.logica.Paquete;
import sockets.servidor.gui.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexionConCLiente implements Runnable {
    String nik,ip,mensaje; // variables que traera el paquete que recibiremos del cliente
    VentanaServidor ventanaServidor = new VentanaServidor();

    @Override
    public void run() {
        try {
            ServerSocket miServidor = new ServerSocket(9998);
            Paquete paqueteRecibirDelCliente;
            while(true) {
                Socket miSocket = miServidor.accept();
                ObjectInputStream flujoEntrada = new ObjectInputStream(miSocket.getInputStream());
                paqueteRecibirDelCliente = (Paquete) flujoEntrada.readObject(); // Cast que se realiza porque "paqueteRecibidoDelCliente" no es del mismo tipo que flujo de entrada que es de tipo "ObjectInputStream".
                nik = paqueteRecibirDelCliente.getNik();
                ip = paqueteRecibirDelCliente.getIp();
                mensaje = paqueteRecibirDelCliente.getMensaje();
                ventanaServidor.setContenedorDelServidor("\n" + nik + " ---> "+ip +" : "+ mensaje);
                miSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
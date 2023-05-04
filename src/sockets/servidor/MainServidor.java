package sockets.servidor;

import sockets.servidor.logica.ConexionConCLiente;

public class MainServidor {

    public static void main(String[] args) {
            Thread hiloConexionConCliente = new Thread(new ConexionConCLiente());
            hiloConexionConCliente.start();
        }
}


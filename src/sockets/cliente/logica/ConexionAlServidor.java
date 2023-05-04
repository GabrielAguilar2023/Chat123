package sockets.cliente.logica;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConexionAlServidor {

    public static void enviarDatoAlServidor (Object dato) {
        try {
            Socket miSocket = new Socket("192.168.0.37", 9998);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(miSocket.getOutputStream());
            flujoSalida.writeObject(dato); //
            flujoSalida.close();
            miSocket.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(3);
        }
    }
    public static void cerrarVentana(){
        System.exit(0);
    }
}

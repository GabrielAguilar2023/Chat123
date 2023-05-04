package sockets.cliente.logica;

import java.io.Serializable;

public class Paquete implements Serializable { // para poder enviar por la red la informacion contenida en el objeto
    private String nik,ip,mensaje;

    public String getNik() {
        return nik;
    }

    public String getIp() {
        return ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Paquete(String nik, String ip, String mensaje) {
        this.nik = nik;
        this.ip = ip;
        this.mensaje = mensaje;
    }
}

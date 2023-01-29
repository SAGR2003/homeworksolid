package service;
import modelo.Envio;

public class EmailOutlook {
    
    //Se creo otro metodo para que tengan un unico proposito (Single Responsability)
    public void conectarServidor(Envio envio){
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
        enviarEmail(envio);
    }

    public void enviarEmail(Envio envio) {
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }
}


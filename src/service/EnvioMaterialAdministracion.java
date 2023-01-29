
package service;

import java.util.ArrayList;
import modelo.Envio;


public class EnvioMaterialAdministracion implements IEnviar{ // Se creo la clase que implementa la interfaz para disminuir el acoplamiento

    @Override
    public void enviarMaterialEstudiante() {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Cuaderno");
        envio.material.add("Lapiz");
        envio.saludoDirector = "Andres envia saludos";
        EmailOutlook email = new EmailOutlook();
        email.conectarServidor(envio);
    }

    @Override
    public void enviarEmail() {

    }
    
}

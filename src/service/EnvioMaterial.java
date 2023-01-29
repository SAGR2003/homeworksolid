package service;

public class EnvioMaterial {
     //Principio de inversión de dependencias: Se debe depender de clases abstractas y no directamente de las clases, lo que nos permitirá cambiar  una clase por otra, sin tener que cambiar prácticamente nada.
    
        private IEnviar interfaz;
        
        public EnvioMaterial(IEnviar interfaz) {
            this.interfaz = interfaz;
        }
        
        public void enviarMaterialEstudiante() {
            interfaz.enviarMaterialEstudiante();
        } 
    
        void enviarEmail() {
            interfaz.enviarEmail();
        }
        
    }
    



package service;

public class Main { 

    public static void main(String[] args) {
        EnvioMaterial material = new EnvioMaterial(new EnvioMaterialAdministracion());
        material.enviarMaterialEstudiante();
    }
}

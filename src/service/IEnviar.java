//Se crea una interfaz y se le asigna lo que necesita hacer (Interface segregation)
package service;

public interface IEnviar {
    void enviarMaterialEstudiante();

    void enviarEmail();
}

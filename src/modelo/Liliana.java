package modelo;

//Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el metodo quede abierto a extensión y cerrado a modificación
public class Liliana extends Estudiante {
    public Liliana() {
        super("Industrial");
    }
    //Usamos override (sobrescribir) de tal forma que la clase hija pueda comportarse de manera distinta al padre
    @Override
    public void mostrarMaterias() {
        System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
    }

}

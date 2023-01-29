package modelo;

//Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el metodo quede abierto a extensión y cerrado a modificación
public class Daniel extends Estudiante{
    public Daniel(){
        super("Informatica");
    }
    //Usamos override (sobrescribir) de tal forma que la clase hija pueda comportarse de manera distinta al padre
    @Override
    public void mostrarMaterias(){
        System.out.println("Programacion, Arquitectura, Base de datos");
    }
}

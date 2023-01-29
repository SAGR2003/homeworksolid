package main;
import modelo.*;

public class Main {
    public static void main(String[] args) {
        //Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el metodo quede abierto a extensión y cerrado a modificación
        Estudiante[] listadoEstudiantes = {
                new Daniel(),
                new Monica(),
                new Liliana()
        };
        verMateriasEstudiantes(listadoEstudiantes);
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
                //Open closed, para que no tenga que  modificar el metodo cada vez que se añada una carrera
        for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.getCarrera());
                estudiante.mostrarMaterias();
        }
    }
}

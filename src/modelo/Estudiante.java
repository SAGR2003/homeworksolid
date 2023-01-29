package modelo;
//Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el metodo quede abierto a extensión y cerrado a modificación
public abstract class Estudiante {
    // Una clase puede sustituirse por cualquiera de una clase hija (Liskov substitution)
    public String carrera;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

    public String getCarrera(){
        return carrera;
    }
    abstract public void mostrarMaterias();

}

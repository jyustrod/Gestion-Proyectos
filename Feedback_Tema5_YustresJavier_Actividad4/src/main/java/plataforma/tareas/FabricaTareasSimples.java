package plataforma.tareas;

public class FabricaTareasSimples extends FabricaTareas {
    @Override
    public Tarea crearTarea(String nombre) {
        return new Tarea(nombre);
    }
}
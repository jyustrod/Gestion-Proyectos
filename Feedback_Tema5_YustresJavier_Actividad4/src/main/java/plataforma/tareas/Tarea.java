package plataforma.tareas;

public class Tarea {
    private String nombre;
    private String estado;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.estado = "Pendiente";
    }

    public void ejecutar() {
        this.estado = "Completada";
        System.out.println("Tarea " + nombre + " completada.");
    }

    public String getEstado() {
        return estado;
    }
}
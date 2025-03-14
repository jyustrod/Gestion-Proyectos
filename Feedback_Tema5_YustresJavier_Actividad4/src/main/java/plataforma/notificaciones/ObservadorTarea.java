package plataforma.notificaciones;

public class ObservadorTarea implements IObservador {
    @Override
    public void actualizar() {
        System.out.println("Notificación recibida: Se ha actualizado una tarea.");
    }
}

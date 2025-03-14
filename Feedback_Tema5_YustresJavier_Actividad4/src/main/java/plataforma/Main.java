package plataforma;

import plataforma.tareas.*;
import plataforma.integracion.*;
import plataforma.notificaciones.*;

public class Main {
    public static void main(String[] args) {

        FabricaTareas fabrica = new FabricaTareasSimples();
        Tarea tarea = fabrica.crearTarea("Diseñar UI");
        tarea.ejecutar();

        HerramientaExterna trello = new AdaptadorTrello();
        trello.obtenerDatos();

        HerramientaExterna drive = new AdaptadorGoogleDrive();
        drive.obtenerDatos();

        ServicioNotificaciones servicio = new ServicioNotificaciones();
        IObservador observador = new ObservadorTarea();
        servicio.agregarObservador(observador);
        servicio.notificarObservadores();
    }
}

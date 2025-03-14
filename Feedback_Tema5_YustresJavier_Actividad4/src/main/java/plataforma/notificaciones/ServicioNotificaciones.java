package plataforma.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class ServicioNotificaciones {
    private List<IObservador> observadores = new ArrayList<>();

    public void agregarObservador(IObservador IObservador) {
        observadores.add(IObservador);
    }

    public void eliminarObservador(IObservador IObservador) {
        observadores.remove(IObservador);
    }

    public void notificarObservadores() {
        for (IObservador o : observadores) {
            o.actualizar();
        }
    }
}
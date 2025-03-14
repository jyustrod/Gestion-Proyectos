package plataforma.integracion;

public class AdaptadorTrello implements HerramientaExterna {
    @Override
    public void obtenerDatos() {
        System.out.println("Obteniendo datos desde Trello...");
    }
}

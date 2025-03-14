package plataforma.integracion;

public class AdaptadorGoogleDrive implements HerramientaExterna {
    @Override
    public void obtenerDatos() {
        System.out.println("Obteniendo datos desde Google Drive...");
    }
}

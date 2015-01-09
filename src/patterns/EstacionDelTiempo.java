package patterns;

/**
 * Created by juan on 12/12/14.
 */
public class EstacionDelTiempo {
    public static void main(String[] args){
        EstadoDelTiempo estadoDelTiempo = new EstadoDelTiempo();

        VistaCondicionesActuales condicionesActuales = new VistaCondicionesActuales(estadoDelTiempo);
        VistaEstadisticas vistaEstadisticas = new VistaEstadisticas(estadoDelTiempo);

        estadoDelTiempo.definirMedidas(80, 65, 30);
        //estadoDelTiempo.definirMedidas(33, 22, 40);
    }
}

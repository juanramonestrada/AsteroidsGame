package patterns;

/**
 * Created by juan on 13/12/14.
 */

public class VistaEstadisticas implements Observador, MostrarElemento{
    private final Subscriptor estadoDelTiempo;
    private int temp;
    private int humedad;
    private int presion;

    public VistaEstadisticas(Subscriptor estadoDelTiempo){
        this.estadoDelTiempo = estadoDelTiempo;
        estadoDelTiempo.registrarObservador(this);
    }

    @Override
    public void mostrar() {
        System.out.println("Estadisticas: " + temp + "grados F. " + humedad + "% Humedad "+ presion + "psi de Presion: ");
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humedad = humidity;
        this.presion = pressure;
        mostrar();
    }
}

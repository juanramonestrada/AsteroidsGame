package src.CH03.designpatterns.observer.weather;

/**
 * Created by juan on 12/12/14.
 */
public interface Observador {
    public void actualizar(int temp, int humedad, int presion);
}

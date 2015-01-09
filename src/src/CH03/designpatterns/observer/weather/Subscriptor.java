package src.CH03.designpatterns.observer.weather;

/**
 * Created by juan on 12/12/14.
 */
public interface Subscriptor {
    public void registrarObservador();
    public void removerObservador();
    public void notificarObservadores();
}

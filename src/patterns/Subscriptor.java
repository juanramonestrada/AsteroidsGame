package patterns;

/**
 * Created by juan on 12/12/14.
 */
public interface Subscriptor {

    /**
     * con este metodo registro mis posibles observadores
     */
    public void registrarObservador(Observador observador);

    /**
     * con este remuevo los que ya no son mas necesarios
     */
    public void removerObservador(Observador observador);

    /**
     * este lo uso para notificar a todos los observadores de cambios en este
     * objeto
     */
    public void notificarObservador();
}

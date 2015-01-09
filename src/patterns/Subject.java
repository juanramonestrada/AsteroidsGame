package patterns;

/**
 * Created by juan on 12/12/14.
 */
public interface Subject {
    public void registerObserver(Observador o);
    public void removeObserver(Observador o);
    public void notifyObservers();
}

package patterns;

/**
 * Created by juan on 12/12/14.
 */
public class CurrentWether implements Observador {

    private int temp;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temp, int humidity, int pressure) {

    }
}

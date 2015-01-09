package patterns;

/**
 * Created by juan on 12/12/14.
 */
public class WatherStation implements Subject {
    private int temp;
    private int humidity;
    private int pressure;


    @Override
    public void registerObserver(Observador o) {

    }

    @Override
    public void removeObserver(Observador o) {

    }

    @Override
    public void notifyObservers() {

    }

    public int getState(){
        return 0;
    }
    public void setState(int state){

    }
}

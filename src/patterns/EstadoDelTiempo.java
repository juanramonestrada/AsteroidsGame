package patterns;

import java.util.ArrayList;

/**
 * Created by juan on 12/12/14.
 */
public class EstadoDelTiempo implements Subscriptor {
    private ArrayList observers;
    private int temperatura;
    private int humedad;
    private int presion;

    public EstadoDelTiempo(){
        observers = new ArrayList();
    }

    @Override
    public void registrarObservador(Observador o) {
        observers.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notificarObservador() {
        for(int i = 0; i < observers.size(); i++){
            Observador observador = (Observador)observers.get(i);
            observador.update(temperatura, humedad, presion);
        }
    }

    /**
     * agrego los metodos accesores y modificadores necesarios
     * para manipular este objeto
     */
    public int obtenerTemperatura(){
        return temperatura;
    }

    public int obtenerHumedad(){
        return humedad;
    }

    public int obtenerPresion(){
        return presion;
    }

    public void medidasCambiaron(){
        notificarObservador();
    }

    public void definirMedidas(int temperatura, int humedad, int presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        medidasCambiaron();
    }
}

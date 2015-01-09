package patterns;

/**
 * Created by juan on 12/12/14.
 */
public class VistaCondicionesActuales implements Observador, MostrarElemento {
    private int temperatura;
    private int humedad;
    private Subscriptor estadoTiempo;

    public VistaCondicionesActuales(Subscriptor estadoTiempo){
        this.estadoTiempo = estadoTiempo;
        estadoTiempo.registrarObservador(this);
    }

    @Override
    public void mostrar() {
        System.out.println("Condiciones Actuales: " + temperatura + "grados F y " + humedad + "% humedad");
    }

    @Override
    public void update(int temp, int humedad, int presion) {
        this.temperatura = temp;
        this.humedad = humedad;
        mostrar();
    }

}

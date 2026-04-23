package INT1;

import java.util.ArrayList;

public class PartidoPerron {

    private ArrayList<EnviadorMensaje> Mensajeros;

    public PartidoPerron() {
        Mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorMensaje mensajero) {
        Mensajeros.add(mensajero);
    }

    public void hacerCampana(){
        for (EnviadorMensaje mensajero : Mensajeros) {
            mensajero.enviarMensaje("Vota por el partido perron");
        }
    }

}

package INT1;

public class PartidoPerron {

    private EnviadorMensaje[] Mensajeros;
    private int cont;

    public PartidoPerron() {
        Mensajeros = new EnviadorMensaje[10]; 
        cont = 0;
    }

    public void agregarMensajero(EnviadorMensaje mensajero) {
        Mensajeros[cont] = mensajero;
        cont++;
    }

    public void hacerCampana() {

        for (int i = 0; i < cont; i++) {
            Mensajeros[i].enviarMensaje("Vota por el partido perron");
        }
    }
}


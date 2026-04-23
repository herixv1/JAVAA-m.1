package INT1;

public class PalomaMensajera extends AVE implements EnviadorMensaje {

    public void volarRapido(){
        System.out.println("La paloma mensajera vuela rápido");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println("La paloma mensajera está enviando el mensaje: " + mensaje);
    }

}

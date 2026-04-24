package INT1;

public class PalomaMensajera extends AVE implements EnviadorMensaje {

    public void volarRapido(){
        System.out.println("La paloma mensajera vuela rapido");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println("La paloma mensajera esta enviando el mensaje: " + mensaje);
    }

}

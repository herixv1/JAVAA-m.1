package INT1;

public class Telefonito extends Dispositivo implements EnviadorMensaje {

    public void  llamar(){
        System.out.println("El telefonito está llamando");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println("El telefonito está enviando el mensaje: " + mensaje);
    }


}

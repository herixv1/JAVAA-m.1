package INT1;

public class Persona implements EnviadorMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("La persona le esta diciendo a todos: " + mensaje);
    }


}

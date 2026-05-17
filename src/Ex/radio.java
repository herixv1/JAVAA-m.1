package Ex;

public class radio extends dispositivocom implements alerta {

    public radio(String marca) {
        super(marca);
    }

    public void transmitirfrecuencia() {

    }

    @Override
    public void encender() {
        System.out.println("Encendiendo radio...");
    }

    @Override
    public void EnviarAlerta(String mensaje) {
        System.out.println("Alerta de radio: " + mensaje);
    }

}

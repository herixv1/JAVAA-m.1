package Ex;

public class appmovil extends dispositivocom implements alerta {

    public appmovil(String marca) {
        super(marca);
    }

    public void notificacionpush() {

    }

    @Override
    public void encender() {
        System.out.println("Iniciando aplicación móvil...");
    }

    @Override
    public void EnviarAlerta(String mensaje) {
        System.out.println("alerta push : " + mensaje);
    }

}

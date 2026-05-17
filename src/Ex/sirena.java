package Ex;

public class sirena extends vehiculo implements alerta {
    private int volumen;

    public sirena(int codigo, String zona, int volumen) {
        super(codigo, zona);
        this.volumen = volumen;
    }

    @Override
    public void activar() {
        System.out.println("Sirena " + getCodigo() + " activada en zona " + getZona());
    }

    public void sonarsirena() {

    }

    @Override
    public void EnviarAlerta(String mensaje) {
        System.out.println("Alerta de sirena: " + mensaje);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}

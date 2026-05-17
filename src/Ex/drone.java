package Ex;

public class drone extends vehiculo implements alerta {
    private double AlturaVuelo;

    public drone(int codigo, String zona, double alturaVuelo) {
        super(codigo, zona);
        AlturaVuelo = alturaVuelo;
    }

    @Override
    public void activar() {
        System.out.println("Drone " + getCodigo() + " activado en zona " + getZona());
    }

    public void volar() {

    }

    @Override
    public void EnviarAlerta(String mensaje) {
        System.out.println("Alerta enviada desde el drone: " + mensaje);
    }

    public double getAlturaVuelo() {
        return AlturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        AlturaVuelo = alturaVuelo;
    }

}

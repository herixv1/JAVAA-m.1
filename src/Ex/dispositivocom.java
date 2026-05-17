package Ex;

public abstract class dispositivocom {
    private String Marca;

    public dispositivocom(String marca) {
        Marca = marca;
    }

    public abstract void encender();

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

}

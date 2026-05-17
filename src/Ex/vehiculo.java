package Ex;

public abstract class vehiculo {
    private int Codigo;
    private String zona;

    public vehiculo(int codigo, String zona) {
        Codigo = codigo;
        this.zona = zona;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public abstract void activar();

}

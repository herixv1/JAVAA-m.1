package Herencia1;

public class Vehiculo {

    private int Ruedas;
    private int cilindros;
    private Double Potencia;
    private Color color;

    public Vehiculo(int Ruedas, int cilindros, Double Potencia, Color color) {
        this.Ruedas = Ruedas;
        this.cilindros = cilindros;
        this.Potencia = Potencia;
        this.color = color;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int ruedas) {
        Ruedas = ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public Double getPotencia() {
        return Potencia;
    }

    public void setPotencia(Double potencia) {
        Potencia = potencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Ruedas=" + Ruedas + ", cilindros=" + cilindros + ", Potencia=" + Potencia + " HP , color=" + color;
    }

}

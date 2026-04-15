package HERENCIAcoche;

public class carro {
    private String matricula;
    private double velocidad;
    private int marcha;

    public carro(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(double valor) {
        if (valor < 0) {
            frenar(-valor);
            return;
        }
        velocidad += valor;
    }

    public void frenar(double valor) {
        if (valor < 0) {
            acelerar(-valor);
            return;
        }
        velocidad -= valor;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    protected void cambiaMarcha(int marcha) {
        if (marcha >= 0) {
            this.marcha = marcha;
        }
    }

    public String toString() {
        return "Matricula: " + matricula + ", Velocidad: " + velocidad + ", Marcha: " + marcha;
    }
}
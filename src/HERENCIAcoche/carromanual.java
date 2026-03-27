package HERENCIAcoche;

public class carromanual extends carro {

    public carromanual(String matricula) {
        super(matricula);
    }

    public void cambiaMarcha(int marcha) {
        if (marcha < 0) {
            System.out.println("Marcha negativa no permitida");
            return;
        }
        super.cambiaMarcha(marcha);
    }

    public void acelerar(double valor) {
        if (valor < 0) {
            frenar(-valor);
            return;
        }

        double[] limites = {0,20,40,60,80,100,120};
        int m = getMarcha();
        double max = limites[m];

        if (getVelocidad() + valor > max) {
            System.out.println("limite de marcha " + m + ": " + max + " km/h");
            super.acelerar(max - getVelocidad());
        } else {
            super.acelerar(valor);
        }
    }
}
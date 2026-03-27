package HERENCIAcoche;

public class carroautomatico extends carro {

    public carroautomatico(String matricula) {
        super(matricula);
    }

    public void acelerar(double valor) {
        if (valor < 0) {
            frenar(-valor);
            return;
        }
        super.acelerar(valor);
        actualizar();
    }

    public void frenar(double valor) {
        if (valor < 0) {
            acelerar(-valor);
            return;
        }
        super.frenar(valor);
        actualizar();
    }

    private void actualizar() {
        double v = getVelocidad();

        if (v == 0) cambiaMarcha(0);
            else 
        if (v <= 20) cambiaMarcha(1);
             else 
        if (v <= 40) cambiaMarcha(2);
            else 
        if (v <= 60) cambiaMarcha(3);
            else 
        if (v <= 80) cambiaMarcha(4);
             else 
        if (v <= 100) cambiaMarcha(5);
             else cambiaMarcha(6);
    }
}
package Herencia1;

public class Moto extends Vehiculo {

    private int Asientos;

    public Moto(int Ruedas, int cilindros, Double Potencia, Color color, int Asientos) {
        super(Ruedas, cilindros, Potencia, color);
        this.Asientos = Asientos;
    }

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int asientos) {
        Asientos = asientos;
    }

    @Override
    public String toString() {
        return "Moto [Asientos=" + Asientos + super.toString() + "]";
    }

    

}

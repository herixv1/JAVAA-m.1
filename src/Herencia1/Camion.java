package Herencia1;

public class Camion extends Vehiculo {

    private int ejes;

    public Camion(int Ruedas, int cilindros, Double Potencia, Color color, int ejes) {
        super(Ruedas, cilindros, Potencia, color);
        if (ejes <= 0) {
            System.out.println("Error 067: [los datos de ejes no pueden ser cero o nulos]");
        } else {
            this.ejes = ejes;
        }
        
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camion [ejes=" + ejes + super.toString() + "]";
    }

}
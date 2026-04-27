package People;

public class Mantenimiento extends Empleado {
    private float bono;

    public Mantenimiento(String nombre, String RFC, String turno, int noEmp, float bono) {
        super(nombre, RFC, turno, noEmp);
        this.bono = bono;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Mantenimiento [bono=" + bono + "]";
    }

    

}

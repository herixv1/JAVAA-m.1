package People;

public class Rventas extends Empleado {
    private int comision;

    public Rventas(String nombre, String RFC, String turno, int noEmp, int comision) {
        super(nombre, RFC, turno, noEmp);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + ", comision=" + comision + "]";
    }

}

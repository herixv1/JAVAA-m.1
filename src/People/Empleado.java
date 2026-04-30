package People;

public abstract class Empleado extends Persona {
    protected String turno;
    protected int noEmp;
    protected double sueldo;

    public Empleado(String nombre, String RFC, String turno, int noEmp, double sueldo) {
        super(nombre, RFC);
        this.turno = turno;
        this.noEmp = noEmp;
        this.sueldo = sueldo;
    }

    public Empleado() {
        super();
        this.turno = "";
        this.noEmp = 0;
        this.sueldo = 0.0;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNoEmp() {
        return noEmp;
    }

    public void setNoEmp(int noEmp) {
        this.noEmp = noEmp;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado-turno=" + turno + ", noEmp=" + noEmp + ", sueldo=" + sueldo;
    }
}

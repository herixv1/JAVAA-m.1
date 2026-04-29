package People;

public abstract class Empleado extends Persona {
    protected String turno;
    protected int noEmp;

    public Empleado(String nombre, String RFC, String turno, int noEmp) {
        super(nombre, RFC);
        this.turno = turno;
        this.noEmp = noEmp;
    }

    public Empleado() {
        super();
        this.turno = null;
        this.noEmp = 0;
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

    @Override
    public String toString() {
        return "Empleado [turno=" + turno + ", noEmp=" + noEmp + "]";
    }

}

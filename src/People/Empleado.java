package People;

public abstract class Empleado extends Persona {
    protected String turno;
    protected int noEmp;

    public Empleado(String nombre, String RFC, String turno, int noEmp) {
        super(nombre, RFC);
        this.turno = turno;
        this.noEmp = noEmp;
    }

}

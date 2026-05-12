package Excepciones;

public class Estudiantes {

private String matricula;
    private String nombre;
    private double promedio;

    public Estudiantes(String matricula, String nombre, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
	}
    
    
}

package Excepciones;

import java.util.ArrayList;
import VectorG.Vector;

public class Curso {
    private String clave;
    private String nombre;
    private int cupoMaximo;
    private Vector<Estudiantes> inscritos;

    public Curso(String clave, String nombre, int cupoMaximo) {
        this.clave = clave;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        inscritos = new Vector<>(cupoMaximo);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Vector<Estudiantes> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Vector<Estudiantes> inscritos) {
        this.inscritos = inscritos;
    }

    // MÉTODO QUE PROPAGA EXCEPCIONES
    public void inscribir(Estudiantes e) throws InscripcionException {

        // Validar matrícula
        if (e.getMatricula() == null || e.getMatricula().isEmpty()) {

            throw new MatriculaInvalidaEx(
                    "\n La matrícula está vacía");
        }

        // Validar nombre
        if (e.getNombre() == null || e.getNombre().isEmpty()) {
            throw new NombreVacioEx("El nombre está vacío");
        }
        if (!e.getNombre().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            throw new NombreVacioEx("El nombre no debe contener numeros ni caracteres especiales");
        }
        // Validar promedio
        if (e.getPromedio() < 70) {
            throw new PromedioInsuficienteEx("\n Promedio insuficiente para inscripcion");
        }

        // Validar cupo
        if (inscritos.getTope() >= cupoMaximo - 1) {

            throw new CursollenoEX(
                    "El curso está lleno");
        }

        inscritos.add(e);
        System.out.println("\n Estudiante inscrito correctamente");
    }

    public void mostrarInscritos() {

        Object[] datos = inscritos.getDatos();

        for (Object obj : datos) {
            Estudiantes e = (Estudiantes) obj;
            System.out.println(e.getNombre());
        }
    }
}

package Veterinaria; // Asegúrate de que esta importación sea correcta según tu estructura de paquetes

public abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public abstract void iniciarMenu();
}
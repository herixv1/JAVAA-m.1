package Veterinaria;


public abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public abstract void iniciarMenu();
}
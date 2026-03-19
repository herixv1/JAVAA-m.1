package Herencia;

import java.time.LocalDate;
import java.time.Period;

public class Animal {
    protected  String nombre;
    protected  String especie;
    protected  LocalDate nacio;
    protected  LocalDate murio;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
        this.nombre = nombre;
        this.especie = "CHIHUAHUAAA";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getNacio() {
        return nacio;
    }

    public void setNacio(LocalDate nacio) {
        this.nacio = nacio;
    }

    public LocalDate getMurio() {
        return murio;
    }

    public void setMurio(LocalDate murio) {
        this.murio = murio;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", especie=" + especie + ", nacio=" + nacio + ", murio=" + murio + "]";
    }

    private int calcularEdad() {
        int edad=0;
        Period periodo = Period.between(this.nacio,LocalDate.now());
        edad= periodo.getYears();
        return edad;
    }

    private int calcularMuerte() {
        int edad=0;
        Period periodo = Period.between(this.nacio,LocalDate.now());
        edad= periodo.getYears();
        return edad;
    }

    public void hacerSonido() {
        System.out.println("hagoo ruido perron como animal");
    }
}
package TAnimales1;

import java.time.LocalDate;
import java.time.Period;


public abstract class Animal {

    protected String    nombre;
    protected String    especie;
    protected LocalDate nacio;
    protected LocalDate murio;
    protected double    peso;


    public Animal(String nombre, String especie, LocalDate nacio, double peso) {
        this.nombre  = nombre;
        this.especie = especie;
        this.nacio   = nacio;
        this.murio   = null; 
        this.peso    = peso;
    }

    public Animal(String nombre, String especie, LocalDate nacio,
                  LocalDate murio, double peso) {
        this.nombre  = nombre;
        this.especie = especie;
        this.nacio   = nacio;
        this.murio   = murio;
        this.peso    = peso;
    }

    public String    getNombre()  { 
        return nombre;  
    }
    public String    getEspecie() { 
        return especie; 
    }
    public LocalDate getNacio()   { 
        return nacio;   
    }
    public LocalDate getMurio()   { 
        return murio;   
    }
    public double    getPeso()    { 
        return peso;    
    }

    public void setNombre (String nombre)     { 
        this.nombre  = nombre;  
    }
    public void setEspecie(String especie)    { 
        this.especie = especie; 
    }
    public void setNacio  (LocalDate nacio)   { 
        this.nacio   = nacio;   
    }
    public void setMurio  (LocalDate murio)   { 
        this.murio   = murio;   
    }
    public void setPeso   (double peso)       { 
        this.peso    = peso;    
    }
    
    public int calcularEdad() {
        LocalDate referencia = (murio != null) ? murio : LocalDate.now();
        return Period.between(nacio, referencia).getYears();
    }

    public boolean estaVivo() {
        return murio == null;
    }

   
    public String mostrarInfo() {
        return "Nombre: "  + nombre             + "\n" +
               "Especie: " + especie            + "\n" +
               "Edad: "    + calcularEdad()     + "\n" +
               "Peso: "    + peso               + "\n" +
               "Estado: "  + (estaVivo() ? "Vivo" : "Fallecido");
    }

    public abstract void hacerSonido();
}

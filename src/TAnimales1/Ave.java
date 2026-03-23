package TAnimales1;

import java.time.LocalDate;

public abstract class Ave extends Oviparo {

    protected double  envergaduraAlas;
    protected boolean puedeVolar;

    public Ave(String nombre, String especie, LocalDate nacio, double peso,
               int cantidadHuevos, double tamanoHuevo,
               double envergaduraAlas, boolean puedeVolar) {
        super(nombre, especie, nacio, peso, cantidadHuevos, tamanoHuevo);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar      = puedeVolar;
    }

    public double  getEnvergaduraAlas()                      { 
        return envergaduraAlas; 
    }
        
    public void    setEnvergaduraAlas(double envergaduraAlas){ 
        this.envergaduraAlas = envergaduraAlas; 
    }
    public boolean isPuedeVolar()                            { 
        return puedeVolar; 
    }
    public void    setPuedeVolar(boolean puedeVolar)         { 
        this.puedeVolar = puedeVolar; 
    }

    public void volar() {
        if (puedeVolar) {
            System.out.println(nombre + " está volando con una envergadura de "
                               + envergaduraAlas + " cm.");
        } else {
            System.out.println(nombre + " no puede volar.");
        }
    }
}
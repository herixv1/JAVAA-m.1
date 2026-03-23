package TAnimales;

import java.time.LocalDate;

public abstract class Oviparo extends Animal {

    protected int    cantidadHuevos;
    protected double tamanoHuevo;


    public Oviparo(String nombre, String especie, LocalDate nacio,
                   double peso, int cantidadHuevos, double tamanoHuevo) {
        super(nombre, especie, nacio, peso);
        this.cantidadHuevos = cantidadHuevos;
        this.tamanoHuevo    = tamanoHuevo;
    }

    public int    getCantidadHuevos()                   { 
        return cantidadHuevos; 
    }
    public void   setCantidadHuevos(int cantidadHuevos) { 
        this.cantidadHuevos = cantidadHuevos; 
    }
    public double getTamanoHuevo()                      { 
        return tamanoHuevo; 
    }
    public void   setTamanoHuevo(double tamanoHuevo)    { 
        this.tamanoHuevo = tamanoHuevo; 
    }

    public void ponerHuevos() {
        System.out.println(nombre + " ha puesto " + cantidadHuevos +
                           " huevo(s) de tamaño " + tamanoHuevo + " cm.");
    }
}
package TAnimales1;

import java.time.LocalDate;

public class Perro extends Mamifero {

    private String  raza;
    private boolean entrenado;


    public Perro(String nombre, String especie, LocalDate nacio, double peso,
                 String tipoAlimentacion, int numeroCrias,
                 String raza, boolean entrenado) {
        super(nombre, especie, nacio, peso, tipoAlimentacion, numeroCrias);
        this.raza       = raza;
        this.entrenado  = entrenado;
    }

    public String  getRaza() { 
        return raza;
     }
    public void    setRaza(String raza) { 
        this.raza = raza;
    }
    public boolean isEntrenado()  { 
        return entrenado; 
    }
    public void    setEntrenado(boolean e) { 
        this.entrenado = e; 
    }


    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau");
    }

    public void socializar() {
        System.out.println(nombre + " esta socializando con otros perros.");
    }

    public void morder() {
        System.out.println(nombre + (entrenado
                ? " muerde solo cuando se lo indican."
                : " puede morder sin aviso."));
    }
}

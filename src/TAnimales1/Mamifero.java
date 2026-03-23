package TAnimales1;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {

    protected String tipoAlimentacion;
    protected int    numeroCrias;


    public Mamifero(String nombre, String especie, LocalDate nacio,
                    double peso, String tipoAlimentacion, int numeroCrias) {
        super(nombre, especie, nacio, peso);
        this.tipoAlimentacion = tipoAlimentacion;
        this.numeroCrias      = numeroCrias;
    }

    public String getTipoAlimentacion()              { 
        return tipoAlimentacion; 
    }
    public void   setTipoAlimentacion(String tipo)   { 
        this.tipoAlimentacion = tipo; 
    }
    public int    getNumeroCrias()                   { 
        return numeroCrias; 
    }
    public void   setNumeroCrias(int numeroCrias)    { 
        this.numeroCrias = numeroCrias; 
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus " + numeroCrias + " crías.");
    }
}



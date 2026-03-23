package TAnimales1;

import java.time.LocalDate;

public class Gato extends Mamifero {

    private boolean esDomestico;
    private int     vidasRestantes;


    public Gato(String nombre, String especie, LocalDate nacio, double peso,
                String tipoAlimentacion, int numeroCrias,
                boolean esDomestico, int vidasRestantes) {
        super(nombre, especie, nacio, peso, tipoAlimentacion, numeroCrias);
        this.esDomestico    = esDomestico;
        this.vidasRestantes = vidasRestantes;
    }

    public boolean isEsDomestico()                  { 
        return esDomestico; 
    }
    public void    setEsDomestico(boolean d)        { 
        this.esDomestico = d; 
    }
    public int     getVidasRestantes()              { 
        return vidasRestantes; 
    }
    public void    setVidasRestantes(int v)         { 
        this.vidasRestantes = v; 
    }


    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando... Purrr~");
    }
}
package TAnimales1;

    import java.time.LocalDate;

public class Perico extends Ave {

    private String  color;
    private boolean habla;


    public Perico(String nombre, String especie, LocalDate nacio, double peso,
                  int cantidadHuevos, double tamanoHuevo,
                  double envergaduraAlas, boolean puedeVolar,
                  String color, boolean habla) {
        super(nombre, especie, nacio, peso,
              cantidadHuevos, tamanoHuevo,
              envergaduraAlas, puedeVolar);
        this.color = color;
        this.habla = habla;
    }

    public String  getColor() { 
        return color; 
    }
    public void    setColor(String color)  { 
        this.color = color; 
    }
    public boolean isHabla() { 
        return habla; 
    }
    public void    setHabla(boolean habla) { 
        this.habla = habla; 
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Imita sonidos");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela ágilmente agitando sus alas de "
                           + envergaduraAlas + " cm.");
    }

    public void repetirPalabras() {
        if (habla) {
            System.out.println(nombre + " repite: Hola Hola Hola");
        } else {
            System.out.println(nombre + " aún no ha aprendido a hablar.");
        }
    }
}

package Herencia;

public class Perro extends Animal {

    private String raza;

    public Perro(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }


    public Perro(String raza) {
        super();
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public void hacerSonido () {
        System.out.println(this.getNombre()+"guau");
    }

    public void Socializar () {
        System.out.println(this.getNombre()+"si soy");
    }

    public void Muerde () {
        System.out.println(this.getNombre()+"*muerde*");
    }

    @Override
    public String toString() {
        return "Prro [raza=" + raza + "]";
    }
    
}
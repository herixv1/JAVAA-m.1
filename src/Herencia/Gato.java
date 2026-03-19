package Herencia;

public class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String nombre) {
        super(nombre);
    }
 
        public void hacerSonido () {
            System.out.println(this.getNombre()+"*miau*");
        }

        public void rasguñar () {
            System.out.println(this.getNombre()+"*rasguña*");
        }

        public void Socializar () {
            System.out.println(this.getNombre()+"*no soy sociable*");
        }   
    
}

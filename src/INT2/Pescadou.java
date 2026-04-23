package INT2;

public class Pescadou extends Animal implements Mascota {

    private String nombre;

    public Pescadou() {
        super(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void jugar() {
        System.out.println("El pez nada en el agua.");
    }
    
    public void comer() {
        System.out.println("El pez come algas.");
    }

    public void caminar() {
        super.caminar(); 
        System.out.println("El pez no puede caminar, nada en el agua.");
    }

}

package INT2;

public class Gatou extends Animal implements Mascota {

    private String nombre;

    public Gatou(String n) {
        super(4);
        nombre = n;
    }

    public Gatou() {
        this("");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void jugar() {
        System.out.println("El gato juega con un hilo.");
    }

     public void comer() {
        System.out.println("El gato come pescado y carne.");
    }


}

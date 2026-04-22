package INT2;

public class Pescadou extends Animal implements Mascota {

    public Pescadou() {
        this.Piernitas = 0; // Los peces no tienen piernas
    }

    @Override
    public void comer() {
        System.out.println("El pez come algas.");
    }

}

package INT2;

public abstract class Animal {

    protected int Piernitas;

    public Animal() {
        this.Piernitas = Piernitas;
    }

    public abstract void comer();

    public void caminar() {
        System.out.println("El animal camina con " + Piernitas + " piernitas.");
    }

}

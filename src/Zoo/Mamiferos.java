package Zoo;

public class Mamiferos extends Animales {
    private String dieta;

    public Mamiferos(String especie, String raza, String dieta, int Nac) {
        super(raza, especie, Nac);
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Mamiferos [dieta=" + dieta + ", " + super.toString() + "]\n";
    }

    

}

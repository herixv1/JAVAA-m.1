package Zoo;

public abstract class Animales {
    protected String raza;
    protected String especie;
    protected int Nac;

    public Animales(String raza, String especie, int Nac) {
        super();
        this.raza = raza;
        this.especie = especie;
        this.Nac = Nac;
    }

    public Animales() {
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getNac() {
        return Nac;
    }

    public void setNac(int nac) {
        Nac = nac;
    }

    @Override
    public String toString() {
        return "raza=" + raza + ", especie=" + especie + ", Nac=" + Nac + "]";
    }  
}

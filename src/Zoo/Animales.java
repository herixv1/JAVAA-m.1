package Zoo;

public abstract class Animales {
    protected String raza;
    protected String especie;
    protected int nac;

    public Animales(String raza, String especie, int nac) {
        super();
        this.raza = raza;
        this.especie = especie;
        this.nac = nac;
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
        return nac;
    }

    public void setNac(int nac) {
        this.nac = nac;
    }

    @Override
    public String toString() {
        return "raza=" + raza + ", especie=" + especie + ", nac=" + nac + "]";
    }  
}

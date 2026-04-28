package Zoo;

public abstract class Animales {
    protected String raza;
    protected String especie;

    public Animales(String raza, String especie) {
        super();
        this.raza = raza;
        this.especie = especie;
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

    @Override
    public String toString() {
        return "raza=" + raza + ", especie=" + especie + "]";
    }

    
    

}

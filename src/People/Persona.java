package People;

public class Persona {

    private String nombre;
    private String RFC;

    public Persona(String nombre, String RFC) {
        this.nombre = nombre;
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", RFC=" + RFC + "]";
    }

    

}

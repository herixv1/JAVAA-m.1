package MVeterinaria;

public enum Genero {
    Macho, 
    Hembra;

    public String getDescripcion() {
        switch (this) {
            case Macho:
                return "El género es macho";
            case Hembra:
                return "El género es hembra";
            default:
                return "Género desconocido";
        }
    }
    public String valores() {
        return this.name();
    }
}

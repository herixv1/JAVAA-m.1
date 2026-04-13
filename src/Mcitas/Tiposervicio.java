package Mcitas;

public enum Tiposervicio {
    CONSULTA("Consulta",500),
    VACUNACION("Vacunación",750),
    CIRUGIA("Cirugía",10000),
    ESTETICA("Estética",500);

    private double precioBase;
    private String tipo;

    private Tiposervicio(String tipo, double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public String valores() {
        return this.tipo +"-"+ this.precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        switch (this) {
            case CONSULTA:
                return "Servicio de consulta veterinaria";
            case VACUNACION:
                return "Servicio de vacunación para mascotas";
            case CIRUGIA:
                return "Servicio de cirugía veterinaria";
            case ESTETICA:
                return "Servicio de estética para mascotas";
            default:
                return "Tipo de servicio desconocido";
        }
    }

}

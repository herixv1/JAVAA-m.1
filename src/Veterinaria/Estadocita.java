package Veterinaria;

public enum Estadocita {
    PROGRAMADA,
    ENPROCESO,
    CANCELADA,
    FINALIZADA;

    public String getDescripcion() {
        switch (this) {
            case PROGRAMADA:
                return "la cita ha sido programada";
            case ENPROCESO:
                return "la cita está en proceso";
            case CANCELADA:
                return "la cita ha sido cancelada";
            case FINALIZADA:
                return "la cita ha sido finalizada";
            default:
                return "estado desconocido";
        }
    }

}

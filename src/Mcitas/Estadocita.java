package Mcitas;

public enum EstadoCita {
    PROGRAMADA,
    EN_PROCESO,
    CANCELADA,
    FINALIZADA;

    public String getDescripcion() {
        switch (this) {
            case PROGRAMADA:
                return "la cita ha sido programada";
            case EN_PROCESO:
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

package Mcitas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Veterinaria.Mascota;

public class Cita {
    private int idcita;
    private LocalDate fecha;
    private java.time.LocalTime hora;
    private Mascota mascota;
    private Tiposervicio tiposervicio;
    private Estadocita estado;
    private boolean primeravez;


    public Cita(int idcita, LocalDate fecha, java.time.LocalTime hora, Mascota mascota, Tiposervicio tiposervicio, Estadocita estado) {
        super();
        this.idcita = idcita;
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.tiposervicio = tiposervicio;
        this.estado = estado;
        this.primeravez=true;
    }

    public void cambiarEstado(Estadocita nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void mostrarInfo() {
        System.out.println("ID de la cita: " + idcita);
        System.out.println("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Hora: " + hora.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("Mascota: " + mascota.getNombre());
        System.out.println("Estado: " + estado.getDescripcion());
        System.out.println("servicio: " + tiposervicio.getTipo());
        System.out.println("precioBase: " + tiposervicio.getPrecioBase());
    }



}

package Mcitas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import MVeterinaria.Mascota;
import Mconsultas.Veterinario;

public class Cita {
    private int idcita;
    private LocalDate fechaCita;
    private java.time.LocalTime horaCita;
    private Mascota mascota;
    private TipoServicio tiposervicio;
    private EstadoCita estadoCita;
    private boolean primeravez;
    private Veterinario veterinario;
    private boolean asistio;

    
    public Cita(int idcita, LocalDate fechaCita, LocalTime horaCita, Mascota mascota, TipoServicio tiposervicio,
            EstadoCita estadoCita, boolean primeravez, Veterinario veterinario, boolean asistio) {
        this.idcita = idcita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.mascota = mascota;
        this.tiposervicio = tiposervicio;
        this.estadoCita = estadoCita;
        this.primeravez = primeravez;
        this.veterinario = veterinario;
        this.asistio = asistio;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public java.time.LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(java.time.LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public TipoServicio getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(TipoServicio tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public boolean isPrimeravez() {
        return primeravez;
    }

    public void setPrimeravez(boolean primeravez) {
        this.primeravez = primeravez;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Cita [idcita=" + idcita + ", fechaCita=" + fechaCita + ", horaCita=" + horaCita + ", mascota=" + mascota
                + ", tiposervicio=" + tiposervicio + ", estadoCita=" + estadoCita + ", primeravez=" + primeravez
                + ", veterinario=" + veterinario + "]";
    }



    public boolean isAsistio() {
        return asistio;
    }



    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    
}

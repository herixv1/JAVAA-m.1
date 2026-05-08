package Mconsultas;

import java.time.LocalDate;

import MVeterinaria.Mascota;

public class Consulta {
    private int idConsulta;
    private float peso;
    private float altura;
    private LocalDate fechaConsulta;
    private String diagnostico;
    private String tratamiento;
    private boolean asistio;
    private Mascota mascota;
    private Veterinario veterinario;
    public Consulta(int idConsulta, float peso, float altura, LocalDate fechaConsulta, String diagnostico,
            String tratamiento, boolean asistio, Mascota mascota, Veterinario veterinario) {
        this.idConsulta = idConsulta;
        this.peso = peso;
        this.altura = altura;
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.asistio = asistio;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }
    public int getIdConsulta() {
        return idConsulta;
    }
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }
    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public boolean isAsistio() {
        return asistio;
    }
    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void contarCita(){
        System.out.println("Cita contabilizada.");
    }
    
    public void marcarAsistencia(){
        this.asistio = true;
    }

    public void registrarDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    public void registrarTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }
    
    @Override
    public String toString() {
        return "Consulta [idConsulta=" + idConsulta + ", peso=" + peso + ", altura=" + altura + ", FechaConsulta="
                + fechaConsulta + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", asistio="
                + asistio + ", mascota=" + mascota + ", veterinario=" + veterinario + "]";
    }

    

}

package Mconsultas;

import java.time.LocalDate;
import java.util.Arrays;

public class VFConsultas {
    private int ultimo;
    private Consulta consultas[];
    public VFConsultas(int ultimo, Consulta[] consultas) {
        this.ultimo = ultimo;
        this.consultas = consultas;
    }
    public int getUltimo() {
        return ultimo;
    }
    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
    public Consulta[] getConsultas() {
        return consultas;
    }
    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public boolean vacio(){
        return ultimo == 0;
    }
    public boolean lleno(){
        return ultimo == consultas.length;
    }

    public void agregar(Consulta consulta){
        if(!lleno()){
            consultas[ultimo] = consulta;
            ultimo++;
        }
    }

    public void eliminar(int idConsulta){
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getIdConsulta() == idConsulta){
                for(int j = i; j < ultimo - 1; j++){
                    consultas[j] = consultas[j+1];
                }
                consultas[ultimo - 1] = null;
                ultimo--;
                return;
            }
        }
    }

    public void actualizar(int idConsulta){
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getIdConsulta() == idConsulta){
                System.out.println("Consulta encontrada. Aquí se puede actualizar la consulta " + idConsulta);
                return;
            }
        }
    }

    public void ordenar(){
        for(int i = 0; i < ultimo - 1; i++){
            for(int j = 0; j < ultimo - i - 1; j++){
                if(consultas[j].getIdConsulta() > consultas[j+1].getIdConsulta()){
                    Consulta temporal = consultas[j];
                    consultas[j] = consultas[j+1];
                    consultas[j+1] = temporal;
                }
            }
        }
    }

    public String presentarConsulta(int idConsulta){
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getIdConsulta() == idConsulta){
                return consultas[i].toString();
            }
        }
        return "Consulta no encontrada";
    }

    public String presentarXFecha(LocalDate fecha){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getFechaConsulta().equals(fecha)){
                resultados.append(consultas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay consultas en esa fecha.";
    }

    public String presentarConsultasAtendidas(LocalDate fecha){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getFechaConsulta().equals(fecha) && consultas[i].isAsistio()){
                resultados.append(consultas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay consultas atendidas en esa fecha.";
    }

    public String presentarTodasConsultas(){
        if(vacio()) return "No hay consultas registradas.";
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            resultados.append(consultas[i].toString()).append("\n");
        }
        return resultados.toString();
    }

    public String presentarConsultasMascota(String nombreMascota){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getMascota() != null && consultas[i].getMascota().toString().contains(nombreMascota)){
                resultados.append(consultas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay consultas para esa mascota.";
    }

    public String presentarConsultasVeterinario(String nombreVeterinario){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getVeterinario() != null && consultas[i].getVeterinario().getNombre().equalsIgnoreCase(nombreVeterinario)){
                resultados.append(consultas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay consultas para ese veterinario.";
    }

    @Override
    public String toString() {
        return "FConsultas [ultimo=" + ultimo + ", consultas=" + Arrays.toString(consultas) + "]";
    }
}

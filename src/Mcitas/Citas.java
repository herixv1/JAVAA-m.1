package Mcitas;

import java.time.LocalDate;
import java.util.Arrays;


public class Citas {
    private Cita citas[];
    private int ultimo;
    
    public Citas(Cita[] citas, int ultimo) {
        this.citas = citas;
        this.ultimo = ultimo;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public boolean vacio(){
        return ultimo == 0;
    }
    
    public boolean lleno(){
        return ultimo == citas.length;
    }

    public void agregar(Cita cita){
        if(!lleno()){
            citas[ultimo] = cita;
            ultimo++;
        }
    }

    public void eliminar(int idcita){
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getIdcita() == idcita){
                for(int j = i; j < ultimo - 1; j++){
                    citas[j] = citas[j+1];
                }
                citas[ultimo - 1] = null;
                ultimo--;
                return;
            }
        }
    }

    public void actualizar(int idcita){
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getIdcita() == idcita){
                System.out.println("Cita encontrada. Aquí se puede actualizar la cita " + idcita);
                return;
            }
        }
    }

    public void ordenar(){
        for(int i = 0; i < ultimo - 1; i++){
            for(int j = 0; j < ultimo - i - 1; j++){
                if(citas[j].getIdcita() > citas[j+1].getIdcita()){
                    Cita temporal = citas[j]; 
                    citas[j] = citas[j+1];
                    citas[j+1] = temporal;
                }
            }
        }
    }

    public String presentarUnaCita(int idcita){
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getIdcita() == idcita){
                return citas[i].toString();
            }
        }
        return "Cita no encontrada";
    }

    public String presentarCitasXFecha(LocalDate fecha){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getFechaCita().equals(fecha)){
                resultados.append(citas[i].toString()).append("\n"); 
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay citas en esa fecha.";
    }

    public String presentarCitasAtendidas(LocalDate fecha){
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getFechaCita().equals(fecha) && citas[i].isAsistio()){
                resultados.append(citas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay citas atendidas en esa fecha.";
    }

    public String presentarPrimeraVez(){
        return "Citas [citas=" + java.util.Arrays.toString(citas) + ", ultimo=" + ultimo + "]";
    }

    public String presentarTodasCitas(){
        if(vacio()) return "No hay citas registradas.";
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            resultados.append(citas[i].toString()).append("\n"); 
        }
        return resultados.toString();
    }

    public String presentarCitasVeterinario(String nombreVeterinario){ 
        StringBuilder resultados = new StringBuilder();
        for(int i = 0; i < ultimo; i++){
            if(citas[i].getVeterinario() != null && citas[i].getVeterinario().getNombre().equalsIgnoreCase(nombreVeterinario)){ 
                resultados.append(citas[i].toString()).append("\n");
            }
        }
        return resultados.length() > 0 ? resultados.toString() : "No hay citas para ese veterinario.";
    }
    
    @Override
    public String toString() {
        return "Citas [citas=" + Arrays.toString(citas) + ", ultimo=" + ultimo + "]";
    }
}
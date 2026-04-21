package Mcitas;
import java.time.LocalDate;
import java.time.LocalTime;

import Veterinaria.Mascota;

public class Appcitas {

    public void menucitas() {
        
        Mascota miMascota = new Mascota("Arya");
        Cita cita1 = new Cita(1, LocalDate.now(), LocalTime.now(), miMascota, Tiposervicio.CONSULTA, Estadocita.PROGRAMADA);
        
        miMascota = new Mascota("Michi");
        Cita cita2 = new Cita(2, LocalDate.now(), LocalTime.now(), miMascota, Tiposervicio.VACUNACION, Estadocita.PROGRAMADA);
        
        cita1.mostrarInfo();
        cita2.mostrarInfo();
    }
    

}

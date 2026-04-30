package People;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Persona> PorNombre = (a,b) -> 
    a.getNombre().compareToIgnoreCase(b.getNombre());

    public static Comparator<Persona> PorRFC = (a,b) -> 
    a.getRFC().compareToIgnoreCase(b.getRFC());

    public static Comparator<Rventas> PorComision = (a,b) ->
    Integer.compare(a.getComision(), b.getComision());

    public static Comparator<Mantenimiento> PorBono = (a,b) ->
    Float.compare(a.getBono(), b.getBono());

    public static Comparator<Persona> PorTurnoYSueldo = (a, b) -> {
        if (a instanceof Empleado && b instanceof Empleado) {
            Empleado empA = (Empleado) a;
            Empleado empB = (Empleado) b;
            
            int comparacionTurno = empA.getTurno().compareToIgnoreCase(empB.getTurno());
            if (comparacionTurno == 0) {
                return Double.compare(empA.getSueldo(), empB.getSueldo());
            }
            return comparacionTurno;
        }
        return 0;
    };

}

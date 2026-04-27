package VectorG;

import java.util.Comparator;
import People.Mantenimiento;
import People.Persona;
import People.Rventas;

public class Comparadores {

    public static Comparator<Persona> PorNombre = (a,b) -> 
    a.getNombre().compareToIgnoreCase(b.getNombre());

    public static Comparator<Persona> PorRFC = (a,b) -> 
    a.getRFC().compareToIgnoreCase(b.getRFC());

    public static Comparator<Rventas> PorComision = (a,b) ->
    Integer.compare(a.getComision(), b.getComision());

    public static Comparator<Mantenimiento> PorBono = (a,b) ->
    Float.compare(a.getBono(), b.getBono());

}

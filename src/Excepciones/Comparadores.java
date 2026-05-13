package Excepciones;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Estudiantes> porNombre = (a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre());
}

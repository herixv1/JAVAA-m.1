package Zoo;
import java.util.Comparator;

import Zoo.Animales;
import Zoo.Mamiferos;

public class Comps {

    public static Comparator<Animales> PorRaza= (a1, b) -> 
    a1.getRaza().compareToIgnoreCase(b.getRaza());

    public static Comparator<Animales> PorEspecie= (a1, b) -> 
    a1.getEspecie().compareToIgnoreCase(b.getEspecie());

    /*public static Comparator<Mamiferos> PorDieta= (a1, b) -> 
    a1.getDieta().compareToIgnoreCase(b.getDieta());*/
    
}


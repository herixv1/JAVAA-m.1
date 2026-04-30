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

    public static Comparator<Animales> PorDietaGeneral= (a1, b) ->{
        if(a1 instanceof Mamiferos && b instanceof Mamiferos){
            Mamiferos m1 = (Mamiferos) a1;
            Mamiferos m2 = (Mamiferos) b;
            return m1.getDieta().compareToIgnoreCase(m2.getDieta());
        } else {
            return 0;
        }
    };

    public static Comparator<Animales> PorNacimiento= (a1, b) -> 
    Integer.compare(a1.getNac(), b.getNac());

}


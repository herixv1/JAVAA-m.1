package TAnimales1;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppZoo {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        Perro firulais = new Perro(
                "chikis",
                "Canino",
                LocalDate.now().minusYears(5),   
                12.5,
                "Carnívoro",
                3,
                "chihuahua",
                true
        );

        Gato michi = new Gato(
                "coffee",
                "Felino",
                LocalDate.now().minusYears(5),   
                4.2,
                "Carnívoro",
                4,
                true,
                9
        );

        Perico piolin = new Perico(
                "palomina",
                "Ave",
                LocalDate.now().minusYears(4), 
                0.5,
                2,
                1.5,
                15.0,
                true,
                "Amarillo",
                true
        );

        animales.add(firulais);
        animales.add(michi);
        animales.add(piolin);

        System.out.println("=== INFORMACION DE ANIMALES ===\n");

        for (Animal a : animales) {
            System.out.println(a.mostrarInfo());  
            a.hacerSonido();                      
            System.out.println("----------------------");
        }
    }
}

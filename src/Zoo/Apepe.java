package Zoo;

import VectorG.Vector;


public class Apepe {

    public static void main(String[] args) {
        
    Vector<Animales> mascotas = new Vector<>(10);

    mascotas.add(new Mamiferos("Perro", "Labrador", "Carnívoro"));
    mascotas.add(new Mamiferos("Aves", "Perico", "Semillas"));

    Mamiferos busqueda = new Mamiferos("Aves", "Guacamaya", "Frutas");
    mascotas.add(busqueda);
    
    System.out.println("Búsqueda por especies:");
    System.out.println(mascotas.presentar(busqueda, Comps.PorEspecie));

    System.out.println("Búsqueda por raza:");
    System.out.println(mascotas.presentar(busqueda, Comps.PorRaza));

    }

}

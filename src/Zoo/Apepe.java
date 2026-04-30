package Zoo;

import java.util.Scanner;
import VectorG.Vector;

public class Apepe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Animales> mascotas = new Vector<>(3);

        mascotas.add(new Mamiferos("Perico", "Aves", "Semillas", 2021));
        mascotas.add(new Mamiferos("Labrador", "Perro", "Carnívoro", 2018));
        mascotas.add(new Mamiferos("Guacamaya", "Aves", "Frutas", 2023));

        int opcion = 0;

        do {
            System.out.println("\n========== menu de animalitos ==========");
            System.out.println("1. Mostrar todos los animales");
            System.out.println("2. Ordenar por Año de Nacimiento");
            System.out.println("3. Ordenar por Especie");
            System.out.println("4. Ordenar por Raza");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de Animalitos ---");
                    System.out.println(mascotas.toString());
                    break;
                case 2:
                    mascotas.ordenar(Comps.PorNacimiento);
                    System.out.println("\nVector ordenado por Año de Nacimiento (del mas viejo al mas joven):");
                    break;
                case 3:
                    mascotas.ordenar(Comps.PorEspecie);
                    System.out.println("\nVector ordenado alfabeticamente por Especie :");
                    break;
                case 4:
                    mascotas.ordenar(Comps.PorRaza);
                    System.out.println("\nVector ordenado alfabeticamente por Raza :");
                    break;
                case 5:
                    System.out.println("\nBai teacher");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

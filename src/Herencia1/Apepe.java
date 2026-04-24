package Herencia1;

public class Apepe {

    public static void main(String[] args) {

        Camion camion1 = new Camion(Color.rojo);
        Moto moto1 = new Moto(Color.azul);

        System.out.println("El color del camion es: " + camion1.getColor());
        System.out.println("El color de la moto es: " + moto1.getColor());

    }

}

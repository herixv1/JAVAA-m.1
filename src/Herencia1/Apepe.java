package Herencia1;

public class Apepe {

    public static void main(String[] args) {

        Moto moto1 = new Moto(2, 1, 15.0, Color.rojo, 2);
        Moto moto2 = new Moto(2, 4, 170.0, Color.negro, 1);
        Moto moto3 = new Moto(2, 2, 80.0, Color.azul, 2);
        Camion camion1 = new Camion(12, 8, 600.0, Color.azul, 3);
        Camion camion2 = new Camion(6, 6, 250.0, Color.amarillo, 2);
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(moto3);
        System.out.println(camion1);
        System.out.println(camion2);

        try {
        Camion camion3 = new Camion(6, 8, 400.0, Color.plata, 0);
        } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
        }
        
    }
}

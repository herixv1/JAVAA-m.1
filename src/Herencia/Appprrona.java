package Herencia;

public class Appprrona {

    public static void main(String[] args) {
        Animal mascota = new Animal();
        Perro miperro = new Perro("Chihuahua", "Firulais");
    
        System.out.println(miperro);

        mascota.hacerSonido();  
        miperro.hacerSonido();

        Gato migato = new Gato("Michi");

        System.out.println(migato);
        migato.hacerSonido();
        
        mascota=miperro;
        mascota.hacerSonido();

        miperro=(Perro) mascota;

        if(mascota instanceof Perro){
            System.out.println("Es un perrote");
            miperro.Muerde();
            System.out.println("aaaaaaaa");
        }

        Animal[] animales = new Animal[10];
        animales[0] = miperro;
        animales[1] = migato;
        animales[2] = new Perro("Labrador", "Max");
        animales[3] = new Gato("duque");
        System.out.println("-------------------------------");
        for (Animal a : animales) {
            if (a != null) {
                System.out.println(a);
                a.hacerSonido();
            }
        }   

    }

}

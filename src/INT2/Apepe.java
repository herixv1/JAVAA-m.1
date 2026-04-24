package INT2;

public class Apepe {
    public static void main(String[] args) {
        
        // 1. demostracion de herencia
        Arania miArania = new Arania();
        miArania.caminar(); 

        // 2. demostracion de abstraccion e interfaces
        Mascota mascota1 = new Gatou("Messi");
        Mascota mascota2 = new Pescadou();
        mascota2.setNombre("nemo");

        mascota1.jugar(); 
        mascota2.jugar(); 

        // 3. demostracion de polimorfismo
        Animal[] zoologico = new Animal[] {
            new Gatou("chorizo"),
            new Arania(),
            new Pescadou()
        };

        for (int i = 0; i < zoologico.length; i++) {
            zoologico[i].comer();
            zoologico[i].caminar();
        }
    }
}



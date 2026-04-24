package INT2;

public class Apepe {
    public static void main(String[] args) {
        
        Arania miArania = new Arania();
        miArania.caminar(); 

        Mascota mascota1 = new Gatou("Messi");
        Mascota mascota2 = new Pescadou();
        mascota2.setNombre("nemo");

        mascota1.jugar(); 
        mascota2.jugar(); 

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



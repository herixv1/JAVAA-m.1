package INT1;

public class Apepe {

    public static void main(String[] args) {

    PartidoPerron p = new PartidoPerron();

    p.agregarMensajero(new PalomaMensajera());
    p.agregarMensajero(new Telefonito());
    p.agregarMensajero(new PalomaMensajera());
    p.agregarMensajero(new Persona());
    p.agregarMensajero(new Telefonito());
    p.agregarMensajero(new PalomaMensajera());
    p.agregarMensajero(new Telefonito());


    p.hacerCampana();
    }

}
    